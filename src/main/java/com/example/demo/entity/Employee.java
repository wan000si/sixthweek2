package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "employee")
public class Employee implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Employee() {

    }

    public Employee(Integer id, String name, Integer age, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{\n" +
                "id:" + id + ",\n" +
                " name:" + name + ", \n " +
                "age:" + age + ",\n " +
                "gender:" + gender + "\n}";
    }
}
