package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * ClassName:StudentController
 * Date:     2017年11月6日 下午4:27:40
 * @author   Joe
 * @version
 * @since    JDK 1.8
 */
@Controller
public class EmployeeController {

    /**
     * view:(跳转到JSP界面).
     * @author Joe
     * Date:2017年11月6日下午4:29:27
     *
     * @param map
     * @return
     */

    @Autowired
    private EmployeeService employeeService;

//    @RequestMapping(value = {"/employees", "/"})
//    public String view(Map<String, Object> map) {
//        map.put("name", employeeService.getAll());
//        map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        return "index";
//    }

    @RequestMapping(value = {"/employees", "/"})
    public String list(Map<String, Object> map) {
        map.put("employees", employeeService.getAll());
        return "index";
    }


//    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Collection getAll() {
        return employeeService.getAll();   }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getById(@PathVariable("id") Integer id) {
        return employeeService.getById(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Collection deleteById(@PathVariable("id") Integer id) {
        return employeeService.deleteById(id);
    }

    @RequestMapping( method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @RequestMapping( method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }
}