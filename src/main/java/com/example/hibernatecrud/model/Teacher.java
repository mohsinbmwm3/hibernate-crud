package com.example.hibernatecrud.model;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "teacher_name", nullable = false)
    private String name;

    @Column(name = "teacher_salary", nullable = false)
    private double salary;

    @Column(name = "teacher_email", nullable = false)
    private String email;

    public Teacher() {
    }

    public Teacher(long id, String name, double salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
