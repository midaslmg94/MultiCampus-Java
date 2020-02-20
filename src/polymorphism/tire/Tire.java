package polymorphism.tire;

public class Tire {
    public int maxRotation; //최대 가능한 회전수 : 타이어의 수명
    public int accmulatedRotation; // 누적 회전수
    public String location; // 타이어의 위치
    
    public Tire(String location, int maxRotation){
        this.location=location;
        this.maxRotation=maxRotation;
    }

    // 타이어의 남은 수명을 체크. 수명이 남은 경우 true, 수명이 다한 경우 false 반환
    public boolean roll(){
        accmulatedRotation++;
        if(accmulatedRotation<maxRotation) {
            System.out.printf("*** %s 위치의 타이어의 수명이 %d회 남음 ***\n",location, maxRotation-accmulatedRotation);
            return true;
        }
        else{
            System.out.printf("*** %s 위치의 타이어가 펑크 ***\n",location);
            return false;
        }

    }

    
}
