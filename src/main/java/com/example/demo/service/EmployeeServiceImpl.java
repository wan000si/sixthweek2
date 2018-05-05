package com.example.demo.service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;
    public Collection getAll() {
        return employeeDAO.getAll();
    }
    public Employee getById(Integer id) {
        return employeeDAO.getById(id);
    }

    public Collection deleteById(Integer id) {
        return employeeDAO.deleteById(id);
    }

    public Collection add(Employee employee) {
        return employeeDAO.add(employee);
    }
    public Collection update(Employee employee) {
        return employeeDAO.update(employee);
    }
}
