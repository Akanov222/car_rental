package com.carrental;

import com.carrental.domain.*;
import com.carrental.mail.MailSander;
import com.carrental.validator.*;

public class RentalOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }
    public static void checkAll() {

        while (true) {

            CarRentalOrder cao = readCarRentalOrder();
            if (cao == null) {
                break;
            }

            AnswerReserved ansRent = checkReserved(cao);
            if (!ansRent.isSuccess()) {
                break;
            }

            AnswerCarReserved ansCarRes = checkCarReserved(cao);
            if (!ansCarRes.isSuccess()) {
                break;
            }

            AnswerSufficientFunds ansSuffFun = checkSufficientFunds(cao);
            if (!ansSuffFun.isSuccess()) {
                break;
            }

            AnswerViolations ansViol = checkViolations(cao);
            if (!ansViol.isSuccess()) {
                break;
            }

            sendMail(cao);

        }
    }

    private static CarRentalOrder readCarRentalOrder() {
        CarRentalOrder cao = new CarRentalOrder();
        return cao;
    }

    private static AnswerReserved checkReserved(CarRentalOrder cao) {
        ReservedValidator rva1 = new ReservedValidator();
        rva1.setHostName("Host1");
        rva1.setLogin("Login1");
        rva1.setPassword("Password1");
        return rva1.checkReserved(cao);
    }

    private static AnswerCarReserved checkCarReserved(CarRentalOrder cao) {
        CarReservedValidator crv = new CarReservedValidator();
        return crv.checkCarReserved(cao);
    }

    private static AnswerDriversLicense checkDriversLicense(CarRentalOrder cao) {
        DriversLicenseValidator dlv = new DriversLicenseValidator();
        return dlv.checkDriversLicense(cao);
    }

    private static AnswerSufficientFunds checkSufficientFunds(CarRentalOrder cao) {
        SufficientFundsValidator sfv = new SufficientFundsValidator();
        return sfv.checkSufficientFunds(cao);
    }

    private static AnswerViolations checkViolations(CarRentalOrder cao) {
        ViolationsValidator vv = new ViolationsValidator();
        return vv.checkViolations(cao);
    }

    private static void sendMail(CarRentalOrder cao) {
        new MailSander().sendMail(cao);
    }
}