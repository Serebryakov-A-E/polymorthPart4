
public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineValue, DriverD driver) {
        super(brand, model, engineValue, driver);
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
}
