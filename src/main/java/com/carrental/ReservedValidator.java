package com.carrental;

public class ReservedValidator {

    String hostName;
    String login;
    String password;

    public AnswerReserved checkReserved(CarRentalOrder cao) {
        System.out.println("CheckReserved is running " + hostName + ", " + login + ", " + password);
        AnswerReserved ans = new AnswerReserved();
        ans.success = false;
        return ans;
    }
}
