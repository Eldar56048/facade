package com.company;

public class FuelInjector {
    FuelPump fuelPump = new FuelPump();

    public void on(){
        System.out.println("FuelInjector on");
    }

    public void inject(){
        fuelPump.pump();
        System.out.println("Inject fuel");
    }

    public void off(){
        System.out.println("FuelInjector off");
    }
}
