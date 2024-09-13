package com.carrental.validator;

import com.carrental.domain.AnswerSufficientFunds;
import com.carrental.domain.CarRentalOrder;

public class SufficientFundsValidator {

    public AnswerSufficientFunds checkSufficientFunds(CarRentalOrder cao) {
        System.out.println("checkSufficientFunds is running");
        return new AnswerSufficientFunds();
    }
}
