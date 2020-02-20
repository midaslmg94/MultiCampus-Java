package inheritance.car;

public class Car {
    int speed;
    public void speedUp(){
        speed +=1;
    }
    // final 키워드를 사용해서 재정의 되는 것을 방지
    public final void stop(){

    }
}
