
public class Car extends Transport<DriverB> {
    public Car(String brand, String model, double engineValue, DriverB driver) {
        super(brand, model, engineValue, driver);
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
}
