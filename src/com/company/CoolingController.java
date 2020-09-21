package com.company;

public class CoolingController {
    Radiator radiator = new Radiator();
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    private double TemperatureUpperLimit;
    public void setTemperatureUpperLimit(double TemperatureUpperLimit){
        this.TemperatureUpperLimit = TemperatureUpperLimit;
    }
    public void run(){
        radiator.setSpeed(80.0);
    }

    public void cool(){
        temperatureSensor.getTemperature();
        radiator.on();
    }
    public void stop(){
        radiator.off();
    }
}
