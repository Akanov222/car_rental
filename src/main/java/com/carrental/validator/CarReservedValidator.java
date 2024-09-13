package com.carrental.validator;

import com.carrental.domain.AnswerCarReserved;
import com.carrental.domain.CarRentalOrder;

public class CarReservedValidator {

    public AnswerCarReserved checkCarReserved(CarRentalOrder cao) {
        System.out.println("AnswerCarReserved is running");
        return new AnswerCarReserved();
    }
}
