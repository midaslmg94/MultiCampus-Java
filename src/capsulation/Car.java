package capsulation;
public class Car {
    //	필드
    private int speed;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //	속도를 제한
        if (speed < 0 || speed > 100)
            this.speed = 0;
        else
            this.speed = speed;
    }
}
