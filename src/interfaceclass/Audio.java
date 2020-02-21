package interfaceclass;

public class Audio implements RemoteControl {
    int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다");

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
        System.out.println("현재 오디오 볼륨은 "+this.volume+"입니다.\n");
        System.out.printf("오디오 볼륨을 %d로 조절합니다", this.volume);
    }
}
