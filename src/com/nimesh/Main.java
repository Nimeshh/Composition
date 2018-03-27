package com.nimesh;


public class Main {

    public static void main(String[] args) {
        Dimensions theDimension = new Dimensions(5,6,4);
        Case theCase = new Case("XPro", "Razor", 220, theDimension);

        Monitor theMonitor = new Monitor(550, 21, new Resolution(1080, 2120));

        PC Dell = new PC(theCase, theMonitor, new Motherboard("NVIDIA", 5));

        Dell.getTheMonitor().drawPixel(512,4000,"red");
        System.out.println("The manufacturer is "+Dell.getTheCase().getManufacturer());

        Dell.powerUp();

    }
}
