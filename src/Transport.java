import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineValue;
    private T driver;
    private List<Mechanic> mechanics = new ArrayList<>();
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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanics(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public void showMechanicsInfo() {
        System.out.println("Список всех механиков автомобиля " + brand + ":");
        mechanics.forEach(System.out :: println);
    }

    public void getDiagnosed() {

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

    abstract void printType();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                ", driver=" + driver +
                '}';
    }
}
