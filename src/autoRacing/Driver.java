package autoRacing;

public abstract class Driver {
    private String FIO; // ФИО водителя
    private boolean drivingLicense; // Наличие водительских прав
    private int experience; // Стаж

    public Driver(String FIO, double drivingLicense, int experience) {
        if (FIO != null && !FIO.isEmpty() && !FIO.isBlank()) {
            this.FIO = FIO;
        }
        this.drivingLicense = true;
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stop();

    public abstract void refuelCar();

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        if (FIO != null && !FIO.isEmpty() && !FIO.isBlank()) {
            this.FIO = FIO;
        }
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
