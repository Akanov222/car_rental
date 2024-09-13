package com.carrental.validator;

import com.carrental.domain.AnswerViolations;
import com.carrental.domain.CarRentalOrder;

public class ViolationsValidator {

    public AnswerViolations checkViolations(CarRentalOrder cao) {
        System.out.println("checkViolations is running");
        return new AnswerViolations();
    }
}
