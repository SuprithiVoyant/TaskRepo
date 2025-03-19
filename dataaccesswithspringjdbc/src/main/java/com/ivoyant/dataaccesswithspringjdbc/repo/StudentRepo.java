package com.ivoyant.dataaccesswithspringjdbc.repo;

import com.ivoyant.dataaccesswithspringjdbc.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private PlatformTransactionManager transactionManager;

    public void save(Students students){
        String sql = "insert into student (id, name, course, grade) values (?,?,?,?)";
        template.update(sql, students.getId(),students.getName(),students.getCourse(),students.getGrade());
    }

    public ArrayList<Students> findAll() {
        String sql = "SELECT * FROM student";
        return new ArrayList<>(template.query(sql, (rs, rowNum) -> {
            Students student = new Students();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            student.setGrade(rs.getString("grade"));
            return student;
        }));
    }

    public Students findById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        return template.queryForObject(sql, (rs, rowNum) -> {
            Students student = new Students();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            student.setGrade(rs.getString("grade"));
            return student;
        }, id);
    }

    public int getStudentCount() {
        String sql = "SELECT COUNT(*) FROM student";
        return template.queryForObject(sql, Integer.class);
    }

    public List<Students> findByCourse(String course) {
        String sql = "SELECT * FROM student WHERE course = ?";
        return template.query(sql, (rs, rowNum) -> {
            Students student = new Students();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            student.setGrade(rs.getString("grade"));
            return student;
        }, course);
    }

    public List<String> findDistinctCourses() {
        String sql = "SELECT DISTINCT course FROM student";
        return template.query(sql, (rs, rowNum) -> rs.getString("course"));
    }

    public int[][] saveAll(List<Students> studentList) {
        String sql = "INSERT INTO student (id, name, course, grade) VALUES (?, ?, ?, ?)";
        return template.batchUpdate(sql, studentList, studentList.size(),
                (ps, student) -> {
                    ps.setInt(1, student.getId());
                    ps.setString(2, student.getName());
                    ps.setString(3, student.getCourse());
                    ps.setString(4, student.getGrade());
                });
    }

    public void saveWithProgrammaticTransaction(Students s1, Students s2) {
        TransactionTemplate txTemplate = new TransactionTemplate(transactionManager);

        txTemplate.executeWithoutResult(status -> {
            try {
                String sql = "INSERT INTO student (id, name, course, grade) VALUES (?, ?, ?, ?)";
                template.update(sql, s1.getId(), s1.getName(), s1.getCourse(), s1.getGrade());
                template.update(sql, s2.getId(), s2.getName(), s2.getCourse(), s2.getGrade());

                // Simulate an error
                if (true) {
                    throw new RuntimeException("Programmatic transaction test failed.");
                }

            } catch (Exception e) {
                status.setRollbackOnly(); // Explicit rollback
            }
        });
    }

//    public void saveStudent(Students student) {
//        String sql = "INSERT INTO student (id, name, course, grade) VALUES (?, ?, ?, ?)";
//
//        try {
//            template.update(sql, student.getId(), student.getName(), student.getCourse(), student.getGrade());
//            System.out.println("Student saved successfully.");
//        } catch (DuplicateKeyException ex) {
//            System.out.println("Error: Duplicate ID found. Cannot insert student.");
//        } catch (DataAccessException ex) {
//            System.out.println("Database access error occurred: " + ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println("Some unexpected error occurred: " + ex.getMessage());
//        }
//    }
}