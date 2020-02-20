package polymorphism.tire;

public class KumhoTire extends Tire{

    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    // 메소드 재정의
    public boolean roll(){
        accmulatedRotation++;
        if(accmulatedRotation<maxRotation) {
            System.out.printf("*** %s 위치의 금호 타이어의 수명이 %d회 남음 ***\n",location, maxRotation-accmulatedRotation);
            return true;
        }
        else{
            System.out.printf("*** %s 위치의 금호 타이어가 펑크 ***\n",location);
            return false;
        }
    }
}
