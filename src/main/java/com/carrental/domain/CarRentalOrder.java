package com.carrental.domain;

import java.time.LocalDateTime;

public class CarRentalOrder {

    private Integer userId;
    private Integer carId;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private Address startAddress;
    private Address endAddress;
    private Integer orderId;

}
