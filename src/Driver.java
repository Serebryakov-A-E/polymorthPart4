public abstract class Driver {
    private final String fullName;
    private final boolean driverLicense;
    private final int drivingExperience;
    protected LicenceType licenseType;

    public Driver(String fullName, boolean driverLicense, int drivingExperience, LicenceType licenseType) throws WrongLicenceTypeException {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.drivingExperience = drivingExperience;
        setLicenseType(licenseType);
    }

    public abstract void setLicenseType(LicenceType licenseType) throws WrongLicenceTypeException;

    public LicenceType getLicenseType() {
        return licenseType;
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

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", driverLicense=" + driverLicense +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
