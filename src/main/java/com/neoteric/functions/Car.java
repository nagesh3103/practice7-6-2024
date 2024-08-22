package com.neoteric.functions;

public class Car {
    private String brand;
    private String model;
    private String colour;

    public Car(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }
}
