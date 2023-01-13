public abstract class Driver {
    private final String fullName;
    private final boolean driverLicense;
    private final int drivingExperience;

    public Driver(String fullName, boolean driverLicense, int drivingExperience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.drivingExperience = drivingExperience;
    }

    public void startMove() {
        System.out.println("Start moving");
    }

    public void stop() {
        System.out.println("Stopped");
    }

    public void fillAuto() {
        System.out.println("Filling...");
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
