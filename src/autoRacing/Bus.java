package autoRacing;

public class Bus extends Car implements Competing {

    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("best lap time 14.12");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed 312 km/h");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() +
                " " + getModel() +
                ". Объём двигателя - " + getEngineVolume();
    }
}
