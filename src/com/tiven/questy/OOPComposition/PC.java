package com.tiven.questy.OOPComposition;

public class PC {

    private Case theCase;
    private Monitor monitor;        // COMPOSITION is good cause u can only inherit from one class
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public  void powerUp()
    {
        getTheCase().pressPowerButton();
        drawLogo();

    }
    private void drawLogo()
    {
        //getMonitor().drawPixelAt(200,50,"YELLOW");
        monitor.drawPixelAt(200,50,"YELLOW");

    }
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
