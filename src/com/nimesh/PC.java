package com.nimesh;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp(){
        theCase.powerButton();
        drawLogo();
    }


    private void drawLogo(){
        getTheMonitor().drawPixel(1020, 1960, "Yellow");
        //or can also use the method below to do the same thing
        theMonitor.drawPixel(512, 1020, "Green");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
