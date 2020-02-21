package abstractclass;

public class PhoneExample {
    public static void main(String[] args) {
        // 추상클래스이므로, Phone은 더이상 인스턴스를 만들 수 없음
        /*Phone p = new Phone("홍길동");
        p.turnOn();
        p.turnOff();*/

        SmartPhone sp = new SmartPhone();
        sp.owner="홍길동";
        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();
    }
}
