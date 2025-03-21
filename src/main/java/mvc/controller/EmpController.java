package mvc.controller;

import mvc.dao.EmployeeDao;
import mvc.dto.Employee;
import mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmpController {

    @Autowired
    EmployeeService service;


    @GetMapping({ "/", "/home" })
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/add")
    public String add(Employee employee, ModelMap map) {
        return service.add(employee,map);
    }

    @RequestMapping("/fetch")
    public String fetch(ModelMap map) {
        return service.fetch(map);
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, ModelMap map) {
        return service.delete(id,map);
    }
}
