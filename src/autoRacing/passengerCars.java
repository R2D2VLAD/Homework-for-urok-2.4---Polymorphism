package autoRacing;

import autoRacing.Car;
import autoRacing.Competing;

public class passengerCars extends Car implements Competing { // легковые авто

    public passengerCars(String brand, String model, double engineVolume) {
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
        System.out.println("best lap time 15.1");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed 295 km/h");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() +
                " " + getModel() +
                ". Объём двигателя - " + getEngineVolume();
    }
}
