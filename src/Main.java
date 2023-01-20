import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        List<Mechanic> mechanics = new ArrayList<>();
        List<Driver> drivers = new ArrayList<>();

        DriverB sereja = null;
        DriverC vadim = null;
        DriverD nikita = null;

        try {
            sereja = new DriverB("Sergey A.V.", true, 10, LicenceType.C);
            drivers.add(sereja);
        } catch (WrongLicenceTypeException e) {
            System.out.println(e.getMessage());
        }

        try {
            vadim = new DriverC("Vadim A.V.", true, 10, LicenceType.B);
            drivers.add(vadim);
        } catch (WrongLicenceTypeException e) {
            System.out.println(e.getMessage());
        }

        try {
            nikita = new DriverD("Nikita A.V.", true, 10, LicenceType.D);
            drivers.add(nikita);
        } catch (WrongLicenceTypeException e) {
            System.out.println(e.getMessage());
        }

        assert nikita != null;
        System.out.println(nikita.getFullName() + " имеет права категории " + nikita.getLicenseType());


        Bus first = new Bus("One", "plus", 1.8, nikita);
        Bus second = new Bus("Two", "minus", 3.0, nikita);
        Bus third = new Bus("Three", "m", 2.0, nikita);
        Bus fourth = new Bus("Four", "4", 2.2, nikita);

        Car lada = new Car("Lada", "Granta", 1.7, sereja);
        Car audi = new Car("Audi", "A8", 3.0, sereja);
        Car bmw = new Car("BMW", "Z8", 3.0, sereja);
        Car kia = new Car("Kia", "Sportage 4", 2.4, sereja);

        Truck kamAz = new Truck("KamAz", "222", 4.2, vadim);
        Truck zil = new Truck("ZIL", "164", 5.5, vadim);
        Truck man = new Truck("Man", "TGS", 12.0, vadim);
        Truck mercedesBenz = new Truck("Mercedes Benz", "15", 12.8, vadim);

        transports.add(first);
        transports.add(second);
        transports.add(third);
        transports.add(fourth);

        transports.add(lada);
        transports.add(audi);
        transports.add(bmw);
        transports.add(kia);

        transports.add(kamAz);
        transports.add(zil);
        transports.add(man);
        transports.add(mercedesBenz);

        Mechanic<Car> sergey = new Mechanic<>("Sergey", "MotorsA");
        sergey.setTransport(lada);
        sergey.fixCar();
        sergey.carryOutMaintenance();

        Mechanic<Truck> dima = new Mechanic<>("Dima", "Motors");
        dima.setTransport(zil);
        dima.fixCar();
        dima.carryOutMaintenance();

        Mechanic<Bus> volodya = new Mechanic<>("Volodya", "V-Motors");
        volodya.setTransport(first);
        volodya.fixCar();
        volodya.carryOutMaintenance();

        Mechanic<Transport> moguVsex = new Mechanic("Anatolyi", "AA");
        moguVsex.setTransport(lada);
        moguVsex.fixCar();
        moguVsex.setTransport(zil);
        moguVsex.carryOutMaintenance();


        mechanics.add(sergey);
        mechanics.add(dima);
        mechanics.add(volodya);
        mechanics.add(moguVsex);


        lada.addMechanics(sergey);
        lada.addMechanics(moguVsex);
        lada.showMechanicsInfo();


    }
}
