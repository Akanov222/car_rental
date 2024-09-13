package com.carrental;

import com.carrental.domain.CarRentalOrder;

import static com.carrental.RentalOrderValidator.checkAll;

public class SaveCarRentalOrder {
    public static void main(String[] args) {

        CarRentalOrder cao = new CarRentalOrder();
        cao.uFirstName = "One";
        cao.uLastName = "Two";
        cao.age = "27";
        cao.address = "London";

        long ans = saveCarRentalOrder(cao);
        System.out.println("Number order " + ans);

        RentalOrderValidator crv = new RentalOrderValidator();
        checkAll();
    }
    public static long saveCarRentalOrder(CarRentalOrder cao) {
        long answer;
        answer = 199;
        System.out.println("CarRentalOrder is saved");
        return answer;
    }
}