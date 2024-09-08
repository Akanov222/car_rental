package com.carrental;

import static com.carrental.CarRentalOrderValidator.checkAll;

public class SaveCarRentalOrder {
    public static void main(String[] args) {
        CarRentalOrderValidator crv = new CarRentalOrderValidator();
        checkAll();
        System.out.println();
        long ans = saveCarRentalOrder();
        System.out.println("Number order " + ans);
    }
    public static long saveCarRentalOrder() {
        long answer;
        answer = 199;
        System.out.println("CarRentalOrder is saved");
        return answer;
    }
}