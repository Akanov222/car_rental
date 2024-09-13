package com.carrental.validator;

import com.carrental.domain.AnswerReserved;
import com.carrental.domain.CarRentalOrder;

public class ReservedValidator {

    private String hostName;
    private String login;
    private String password;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AnswerReserved checkReserved(CarRentalOrder cao) {
        System.out.println("CheckReserved is running " + hostName + ", " + login + ", " + password);
        return new AnswerReserved();
    }
}
