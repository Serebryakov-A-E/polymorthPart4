
public class Car extends Transport<DriverB> {

    private BodyType transportType;

    public Car(String brand, String model, double engineValue, DriverB driver) {
        super(brand, model, engineValue, driver);
    }

    @Override
    public void getDiagnosed() {
        System.out.printf("автомобиль %s проходит диагностику...", getBrand());
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
        System.out.println("Пит стоп легкового автомобиля");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время легкового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля");
    }

    public Enum<BodyType> getTransportType() {
        return transportType;
    }

    public void setTransportType(BodyType transportType) {
        this.transportType = transportType;
    }
}
