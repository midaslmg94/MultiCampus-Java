package polymorphism.tire;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 1; i < 5; i++) {
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("왼쪽 앞 타이어를 한국타이어로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽",4);
                    break;
                case 2:
                    System.out.println("왼쪽 오른쪽 타이어를 금호타이어로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽",5);
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 타이어를 한국타이어로 교체");
                    car.backLeftTire = new HankookTire("앞왼쪽",3);
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 타이어를 금호타이어로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽",5);
                    break;
            }
        }
    }

}
