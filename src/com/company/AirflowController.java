package com.company;

public class AirflowController {
    private AirflowMeter airflowMeter = new AirflowMeter();
    public void takeAir(){
        airflowMeter.getMeasuremenst();
        System.out.println("Air taken");
    }
    public void off(){
        System.out.println("AirflowController off");
    }
}
