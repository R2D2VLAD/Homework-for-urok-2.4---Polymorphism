package autoRacing;

public class categoryB <A extends Driver> {
    private String FIO;
    private String Brand;
    private String Model;

    public categoryB(String FIO, String brand, String model) {
        if (FIO != null && !FIO.isEmpty() && !FIO.isBlank()) {
            this.FIO = FIO;
        }
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.Brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.Model = model;
        }
    }

    public void categoryB(passengerCars auto1) {
        System.out.println("Водитель " + getFIO() + " , управляет автомобилем " + getBrand() + " " +
                getModel() + " и будет учавствовать в заезде!");
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        if (FIO != null && !FIO.isEmpty() && !FIO.isBlank()) {
            this.FIO = FIO;
        }
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.Brand = brand;
        }
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.Model = model;
        }
    }
}

