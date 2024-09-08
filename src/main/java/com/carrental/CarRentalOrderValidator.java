package com.carrental;

public class CarRentalOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }
    public static void checkAll() {
        checkCarReserved();
        checkDriversLicense();
        checkSufficientFunds();
        checkViolations();
    }
    public static void checkCarReserved() {
        System.out.println("checkCarReserved is running");
    }
    public static void checkDriversLicense() {
        System.out.println("checkDriversLicense is running");
    }
    public static void checkSufficientFunds() {
        System.out.println("checkSufficientFunds is running");
    }
    public static void checkViolations() {
        System.out.println("checkViolations is running");
    }


}


