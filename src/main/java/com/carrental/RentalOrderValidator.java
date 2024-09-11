package com.carrental;

public class RentalOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }
    public static void checkAll() {

        CarRentalOrder cao = readCarRentalOrder();
        AnswerReserved answerReserved = checkReserved(cao);
        AnswerCarReserved answerCarReserved = checkCarReserved(cao);
        AnswerDriversLicense answerDriversLicense = checkDriversLicense(cao);
        AnswerSufficientFunds answerSufficientFunds = checkSufficientFunds(cao);
        AnswerViolations answerViolations = checkViolations(cao);
        sendMail(cao);
    }

    private static CarRentalOrder readCarRentalOrder() {
        CarRentalOrder cao = new CarRentalOrder();
        return cao;
    }

    private static AnswerReserved checkReserved(CarRentalOrder cao) {
        ReservedValidator rva1 = new ReservedValidator();
        rva1.hostName = "Host1";
        rva1.login = "Login1";
        ReservedValidator rva2 = new ReservedValidator();
        rva2.hostName = "Host1";
        rva2.login = "Login1";
        AnswerReserved ans1 = rva1.checkReserved(cao);
        AnswerReserved ans2 = rva2.checkReserved(cao);

        return ans1;
    }

    private static AnswerCarReserved checkCarReserved(CarRentalOrder cao) {
        System.out.println("AnswerCarReserved is running");
        return new AnswerCarReserved;
    }

    private static AnswerDriversLicense checkDriversLicense(CarRentalOrder cao) {
        System.out.println("checkDriversLicense is running");
        return new AnswerDriversLicense();
    }

    private static AnswerSufficientFunds checkSufficientFunds(CarRentalOrder cao) {
        System.out.println("checkSufficientFunds is running");
        return new AnswerSufficientFunds();
    }

    private static AnswerViolations checkViolations(CarRentalOrder cao) {
        System.out.println("checkViolations is running");
        return new AnswerViolations();
    }

    private static void sendMail(CarRentalOrder cao) {
        System.out.println("sendMail is running");
    }
}


