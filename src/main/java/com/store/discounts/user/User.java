package com.store.discounts.user;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    private LocalDate dob;

    private Integer age;

    private Boolean isEmployee;

    public User() {
    }


    public User(String name, String email, LocalDate dob, Integer age, Boolean isEmployee) {

        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.isEmployee = isEmployee;
    }

//    public User(String name, String email, LocalDate dob, Integer age, Boolean isEmployee) {
//        this.name = name;
//        this.email = email;
//        this.dob = dob;
//        this.age = age;
//        this.isEmployee = isEmployee;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public void setEmployee(Boolean employee) {
        isEmployee = employee;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", isEmployee=" + isEmployee +
                '}';
    }
}
