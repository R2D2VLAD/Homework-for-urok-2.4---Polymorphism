package autoRacing;

import autoRacing.Car;
import autoRacing.Competing;

public class Trucks extends Car implements Competing {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMovement() {
        System.out.println("Поехали!");
    }

    public void endMovement() {
        System.out.println("Стоп!");
    }

    @Override
    public void pitStop() {
        System.out.println("I'm going to the pit stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("best lap time 18.22");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed 300 km/h");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() +
                " " + getModel() +
                ". Объём двигателя - " + getEngineVolume();
    }
}
