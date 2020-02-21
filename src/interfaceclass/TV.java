package interfaceclass;

public class TV implements RemoteControl{
    int volume = 0;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");

    }

    @Override
    public void setVolume(int volume) {
        if (volume < RemoteControl.MIN_VOLUME) {
            this.volume=RemoteControl.MIN_VOLUME;
        } else if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else {
            this.volume=volume;
        }
        System.out.println("현재 TV 볼륨은 "+this.volume+"입니다.");
        System.out.printf("TV볼륨을 %d로 조절합니다", this.volume);
    }
}
