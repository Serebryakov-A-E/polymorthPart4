public class DriverD extends Driver {
    public DriverD(String fullName, boolean driverLicense, int drivingExperience, LicenceType lt) throws WrongLicenceTypeException {
        super(fullName, driverLicense, drivingExperience, lt);
    }

    @Override
    public void setLicenseType(LicenceType licenseType) throws WrongLicenceTypeException {
        if (licenseType != LicenceType.D) {
            throw new WrongLicenceTypeException("Выбрана неверная категория прав у водителя " + getFullName());
        } else {
            this.licenseType = licenseType;
        }
    }
}
