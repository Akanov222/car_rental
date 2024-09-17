package com.carrental.domain;

public class Car {

    private Integer id;
    private String model;
    private CarCategory carCategory;
    private String colour;
    private Integer seatsQuantity;
    private String image;

    public Car(Integer id, String model, CarCategory carCategory, String colour, Integer seatsQuantity, String image) {
        this.id = id;
        this.model = model;
        this.carCategory = carCategory;
        this.colour = colour;
        this.seatsQuantity = seatsQuantity;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarCategory getCarCategoryEntity() {
        return carCategory;
    }

    public void setCarCategoryEntity(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setSeatsQuantity(Integer seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
