package inheritance.cellphone;

public class CellPhone {
   // 필드
    String model;
    String color;
    // 생성자   : 따로 정의 하지 않았으므로 default 생성자가 만들어짐

    // 메소드
    void powerOn(){System.out.println("전원을 켭니다");}
    void powerOff(){System.out.println("전원을 끕니다.");}
    void bell(){System.out.println("벨이 울린다");}
    void sendVoice(String message){System.out.println(">>>"+message);}
    void receiveVoice(String message){System.out.println("<<<"+message);}
    void hangUp(){System.out.println("전화 끊습니다");}






}
