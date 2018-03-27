package com.nimesh;

public class Motherboard {
    private String model;
    private int slots;

    public Motherboard(String model, int slots) {
        this.model = model;
        this.slots = slots;
    }

    public void loadProgram(String programName) {
        System.out.println("Program "+programName+" is now loading...");
    }

    public String getModel() {
        return model;
    }

    public int getSlots() {
        return slots;
    }
}
