package polymorphism.tire;

public class Car {
    Tire frontLeftTire  = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire   = new HankookTire();
    Tire backRightTire  = new HankookTire();

    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}

