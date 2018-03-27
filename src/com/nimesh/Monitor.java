package com.nimesh;

public class Monitor {
    private int model;
    private int size;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor(int model, int size, Resolution nativeResolution) {
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.println(("Drawing pixel in "+x+" and "+y+" in color "+color));
    }

    public int getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return nativeResolution;
    }
}
