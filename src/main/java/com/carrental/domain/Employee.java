package com.carrental.domain;

public class Employee extends User{

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String patronymic, String email, String password) {
        super(id, firstName, lastName, patronymic, email, password);
    }

    @Override
    public String toString() {
        return "Admin" + super.toString();
    }
}
