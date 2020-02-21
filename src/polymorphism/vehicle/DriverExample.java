package polymorphism.vehicle;

public class DriverExample {
    public static void main(String[] args) {
        Driver d1 = new Driver();
        d1.drive(new Taxi());
        d1.drive(new Bus());

    }
}
