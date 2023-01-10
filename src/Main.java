
public class Main {
    public static void main(String[] args) {

        DriverB sereja = new DriverB("Sergey A.V.", true, 10);
        DriverC vadim = new DriverC("Vadim A.V.", true, 10);
        DriverD nikita = new DriverD("Nikita A.V.", true, 10);

        Bus<DriverD> first = new Bus<>("One", "plus", 1.8, nikita);
        Bus<DriverD> second = new Bus<>("Two", "minus", 3.0, nikita);
        Bus<DriverD> third = new Bus<>("Three", "m", 2.0, nikita);
        Bus<DriverD> fourth = new Bus<>("Four", "4", 2.2, nikita);

        Car<DriverB> lada = new Car<>("Lada", "Granta", 1.7, sereja);
        Car<DriverB> audi = new Car<>("Audi", "A8", 3.0, sereja);
        Car<DriverB> bmw = new Car<>("BMW", "Z8", 3.0, sereja);
        Car<DriverB> kia = new Car<>("Kia", "Sportage 4", 2.4, sereja);

        Track<DriverC> kamAz = new Track<>("KamAz", "222", 4.2, vadim);
        Track<DriverC> zil = new Track<>("ZIL", "164", 5.5, vadim);
        Track<DriverC> man = new Track<>("Man", "TGS", 12.0, vadim);
        Track<DriverC> mercedesBenz = new Track<>("Mercedes Benz", "15", 12.8, vadim);

        lada.showDriverInfo();
        audi.showDriverInfo();

        first.showDriverInfo();
        fourth.showDriverInfo();

        zil.showDriverInfo();
        mercedesBenz.showDriverInfo();
    }
}
