package com.carrental;

public class SufficientFundsValidator {

    private static AnswerSufficientFunds checkSufficientFunds(CarRentalOrder cao) {
        System.out.println("checkSufficientFunds is running");
        AnswerSufficientFunds ans =  new AnswerSufficientFunds();
        ans.success = false;
        return ans;
    }
}
