
public class Track extends Transport<DriverC> {

    private Enum<LoadType> transportType;

    public Track(String brand, String model, double engineValue, DriverC driver) {
        super(brand, model, engineValue, driver);
    }

    @Override
    void printType() {
        if (transportType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(transportType);
        }
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

    public Enum<LoadType> getTransportType() {
        return transportType;
    }

    public void setTransportType(Enum<LoadType> transportType) {
        this.transportType = transportType;
    }
}
