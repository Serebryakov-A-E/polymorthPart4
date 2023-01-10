
public class Car<T extends DriverB> extends Transport {
    public Car(String brand, String model, double engineValue, T driver) {
        super(brand, model, engineValue, driver);
    }
}
