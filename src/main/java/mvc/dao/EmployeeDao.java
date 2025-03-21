package mvc.dao;

import mvc.dto.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class EmployeeDao {

    EntityManagerFactory factory= Persistence.createEntityManagerFactory("m5");
    EntityManager manager=factory.createEntityManager();
    EntityTransaction transaction=manager.getTransaction();

    public void save(Employee employee) {
        transaction.begin();
        manager.persist(employee);
        transaction.commit();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> fetchAll() {
        return manager.createNativeQuery("select * from employee",Employee.class).getResultList();
    }

    public Employee find(int id) {
        return manager.find(Employee.class, id);
    }

    public void delete(Employee employee) {
        transaction.begin();
        manager.remove(employee);
        transaction.commit();
    }

}
