
public class Main {
    public static void main(String[] args) {
        System.out.println(BodyType.COUPE);
        System.out.println(LoadType.N3);
        System.out.println(LoadType.N2);
        System.out.println(LoadType.N1);
        System.out.println(CapacityType.LOW);
        System.out.println(CapacityType.BIG);

        DriverB sereja = new DriverB("Sergey A.V.", true, 10);
        DriverC vadim = new DriverC("Vadim A.V.", true, 10);
        DriverD nikita = new DriverD("Nikita A.V.", true, 10);

        Bus first = new Bus("One", "plus", 1.8, nikita);
        Bus second = new Bus("Two", "minus", 3.0, nikita);
        Bus third = new Bus("Three", "m", 2.0, nikita);
        Bus fourth = new Bus("Four", "4", 2.2, nikita);

        Car lada = new Car("Lada", "Granta", 1.7, sereja);
        Car audi = new Car("Audi", "A8", 3.0, sereja);
        Car bmw = new Car("BMW", "Z8", 3.0, sereja);
        Car kia = new Car("Kia", "Sportage 4", 2.4, sereja);

        Track kamAz = new Track("KamAz", "222", 4.2, vadim);
        Track zil = new Track("ZIL", "164", 5.5, vadim);
        Track man = new Track("Man", "TGS", 12.0, vadim);
        Track mercedesBenz = new Track("Mercedes Benz", "15", 12.8, vadim);

        lada.printType();
        lada.setTransportType(BodyType.SEDAN);
        System.out.println(lada);
        lada.printType();
//        lada.showDriverInfo();
//        audi.showDriverInfo();
//
//        first.showDriverInfo();
//        fourth.showDriverInfo();
//
//        zil.showDriverInfo();
//        mercedesBenz.showDriverInfo();
    }
}
