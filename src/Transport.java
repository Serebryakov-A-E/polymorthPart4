
public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineValue;
    private Driver driver;
    public Transport(String brand, String model, double engineValue, Driver driver) {
        if (driver != null) {
            this.driver = driver;
        }

        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineValue > 0) {
            this.engineValue = engineValue;
        } else {
            this.engineValue = 1.5;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void showDriverInfo() {
        System.out.printf("Водитель %s управляет автомобилем %s и будет участвовать в заезде.\n", driver.getFullName(), brand);
    }

    public void startMove() {}

    public void stopMove() {}

    public Driver getDriver() {
        return driver;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп...");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ");
    }
}
