
public class Bus extends Transport<DriverD> {

    private Enum<CapacityType> transportType;

    public Bus(String brand, String model, double engineValue, DriverD driver) {
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
        System.out.println("Пит стоп легкового автобуса");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");
    }

    public Enum<CapacityType> getTransportType() {
        return transportType;
    }

    public void setTransportType(Enum<CapacityType> transportType) {
        this.transportType = transportType;
    }
}
