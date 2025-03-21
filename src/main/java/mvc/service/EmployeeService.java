package mvc.service;

import mvc.dao.EmployeeDao;
import mvc.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao dao;

    public String add(Employee employee, ModelMap map) {
        dao.save(employee);
        map.put("success", "Record Added Success");
        return "home";
    }

    public String fetch(ModelMap map) {
        List<Employee> list=dao.fetchAll();
        if(list.isEmpty()) {
            map.put("failure", "No Records Found");
            return "home";
        }else {
            map.put("list", list);
            return "fetch";
        }
    }

    public String delete(int id, ModelMap map) {
        Employee employee=dao.find(id);
        dao.delete(employee);
        map.put("success", "Record Deleted Success");
        return "fetch";
    }
}
