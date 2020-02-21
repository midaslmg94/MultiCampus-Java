package polymorphism.tire;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 1; i < 5; i ++) {
            car.run();
            System.out.println("-------------------------------");
        }
    }
}
