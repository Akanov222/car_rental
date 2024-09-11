package com.carrental;

public class DriversLicenseValidator {

    private static AnswerDriversLicense checkDriversLicense(CarRentalOrder cao) {
        System.out.println("checkDriversLicense is running");
        AnswerDriversLicense ans = new AnswerDriversLicense();
        ans.success = false;
        return ans;
    }
}
