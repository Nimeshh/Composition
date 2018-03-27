package com.nimesh;

public class Case {
    private String model;
    private String manufacturer;
    private int power;
    private Dimensions dimension;

    public Case(String model, String manufacturer, int power, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.power = power;
        this.dimension = dimension;
    }

    public void powerButton(){
        System.out.println("Power button is pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPower() {
        return power;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
