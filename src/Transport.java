
public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineValue;
    private T driver;
    public Transport(String brand, String model, double engineValue, T driver) {
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

    public void startMove() {
        System.out.println("Транспорт начинает движение.");
    }

    public void stopMove() {
        System.out.println("Транспорт останавливается.");
    }

    public T getDriver() {
        return driver;
    }
}
