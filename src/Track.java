
public class Track extends Transport<DriverC> {
    public Track(String brand, String model, double engineValue, DriverC driver) {
        super(brand, model, engineValue, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп грузовика");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга грузовика");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");
    }
}
