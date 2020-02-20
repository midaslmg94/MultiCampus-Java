package inheritance.cellphone;

public class DmbCellPhone extends CellPhone {
    // 필드
    int channel;

    // 생성자
    public DmbCellPhone(String model, String color, int channel) {
        //super(model,color);
        this.model = model; // 부모의 default 생성자인 model, color을 가져옴
        this.color = color;
        this.channel = channel;
    }

    // 메소드
    void turnOnDmb() {
        System.out.printf("채널 %d번 DMB 방송을 시작합니다\n", channel);
    }
    void powerOff(){
        System.out.println("DMB방송을 종료하고 전원을 끕니다");
        turnOffDmb();
        super.powerOff();
    }
    void turnOffDmb() {
        System.out.printf("채널 %d번 DMB 방송을 종료합니다\n", channel);
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.printf("채널 %d번으로 변경\n", channel);
    }

}
