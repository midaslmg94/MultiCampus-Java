package abstractclass;

public abstract class Phone {
    public String owner;
/*    public Phone(String owner) {
        this.owner = owner;
    }*/
    public void turnOn(){
        System.out.println("핸드폰을 켠다");
    }
    public void turnOff(){
        System.out.println("핸드폰을 끈다");
    }
}
