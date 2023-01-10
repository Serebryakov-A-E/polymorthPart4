
public class Track<T extends DriverC> extends Transport {
    public Track(String brand, String model, double engineValue, T driver) {
        super(brand, model, engineValue, driver);
    }
}
