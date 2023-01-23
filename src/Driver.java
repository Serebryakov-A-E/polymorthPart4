import java.util.Objects;

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
        return fullName + " категория прав " + licenseType.getCategory() + ". Водительский стаж - " + drivingExperience + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName) && licenseType == driver.licenseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, drivingExperience, licenseType);
    }
}
