package com.carrental.domain;

public class Admin extends User{

    public Admin() {
    }

    public Admin(Integer id, String firstName, String lastName, String patronymic, String email, String password) {
        super(id, firstName, lastName, patronymic, email, password);
    }

    @Override
    public String toString() {
        return "Admin" + super.toString();
    }
}
