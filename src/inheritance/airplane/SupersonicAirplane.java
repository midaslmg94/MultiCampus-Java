package inheritance.airplane;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL; // 1:일반비행, 2:초음속 비행
    // 메소드 오버로딩
    public void fly() {
        System.out.print("초음속기 -->");
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행");
        }
        else {
            super.fly();
        }
    }
}
