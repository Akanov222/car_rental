package com.carrental.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Client extends User {

    private String driverLicenceNo;
    private LocalDate dlExpirationDay;
    private BigDecimal creditAmount;
    private Address address;

    public Client() {
    }

    public Client(Integer id, String firstName, String lastName, String patronymic, String email, String password) {
        super(id, firstName, lastName, patronymic, email, password);
    }

    public String getDriverLicenceNo() {
        return driverLicenceNo;
    }

    public void setDriverLicenceNo(String driverLicenceNo) {
        this.driverLicenceNo = driverLicenceNo;
    }

    public LocalDate getDlExpirationDay() {
        return dlExpirationDay;
    }

    public void setDlExpirationDay(LocalDate dlExpirationDay) {
        this.dlExpirationDay = dlExpirationDay;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "driverLicenceNo='" + driverLicenceNo + '\'' +
                ", dlExpirationDay='" + dlExpirationDay + '\'' +
                ", creditAmount='" + creditAmount + '\'' +
                ", address='" + address + '\'' +
                "}" + super.toString();
    }
}
