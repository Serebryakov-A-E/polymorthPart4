public class Mechanic<T extends Transport> {
    private final String fullName;
    private final String company;
    private T transport;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public T getTransport() {
        return transport;
    }


    public void setTransport(T transport) {
        this.transport = transport;
    }

    public void fixCar() {
        System.out.println("Машина " + transport.getBrand() + " починена. Механик: " + fullName);
    }

    public void carryOutMaintenance() {
        System.out.println("Техобслуживание транспорта: " + transport.getBrand() + " Механик: " + fullName);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                ", transport=" + transport +
                '}';
    }
}
