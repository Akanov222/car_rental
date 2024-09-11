package com.carrental;

public class ViolationsValidator {

    private static AnswerViolations checkViolations(CarRentalOrder cao) {
        System.out.println("checkViolations is running");
        AnswerViolations ans = new AnswerViolations();
        ans.success = false;
        return ans;
    }
}
