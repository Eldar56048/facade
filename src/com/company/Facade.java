package com.company;

public class Facade {
    private FuelInjector fuelInjector = new FuelInjector();
    private AirflowController airflowController = new AirflowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();

    public void start(){
        airflowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        catalyticConverter.on();
        coolingController.setTemperatureUpperLimit(80.0);
        coolingController.run();
    }

    public void stop(){
        fuelInjector.off();
        airflowController.off();
        catalyticConverter.off();
        coolingController.cool();
        coolingController.stop();
    }
}
