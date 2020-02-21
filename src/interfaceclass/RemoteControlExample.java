package interfaceclass;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

        rc=new TV();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();
    }
}
