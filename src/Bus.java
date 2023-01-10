
public class Bus<T extends DriverD> extends Transport {
    public Bus(String brand, String model, double engineValue, T driver) {
        super(brand, model, engineValue, driver);
    }
}
