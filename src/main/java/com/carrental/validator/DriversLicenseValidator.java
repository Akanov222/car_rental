package com.carrental.validator;

import com.carrental.domain.AnswerDriversLicense;
import com.carrental.domain.CarRentalOrder;

public class DriversLicenseValidator {

    public AnswerDriversLicense checkDriversLicense(CarRentalOrder cao) {
        System.out.println("checkDriversLicense is running");
        return new AnswerDriversLicense();
    }
}
