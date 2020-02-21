package polymorphism.vehicle;

public class Driver {// 운전사 클래스
    // 메소드 오버로딩 --> 만약 차종이 많아지면 똑같은 코드를 계속 늘려나가야 함
   /* public void drive(Bus bus) {
        bus.run();
    }

    public void drive(Taxi taxi) {
        taxi.run();
    }*/

    // 부모 클래스를 받아옴 --> 다형성 이용
    public void drive(Vehicle vehicle){
        vehicle.run();
    }

}
