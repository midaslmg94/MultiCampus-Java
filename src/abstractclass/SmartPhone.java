package abstractclass;

public class SmartPhone extends Phone {
/*    public SmartPhone(String owner) { // 부모 클래스에 생성자가 정의되어 있으므로 생성자를 강제적으로 생성해줌
        super(owner);
    }*/

    public void internetSearch(){
        System.out.println("인터넷 검색");
    }
}
