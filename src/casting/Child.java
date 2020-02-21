package casting;

public class Child extends Parent{
    public String strChild;
    public void method03(){
        System.out.println("Child Method03");
    }

    public static void main(String[] args) {
        // promotion 발생. p1은 부모 클래스 멤버만 사용
        // 단, 자식 클래스에서 재정의 된 메소드는 제외
        Parent p1 = new Child();
        p1.strParent="data";
        p1.method01();
        p1.method02();
        // 불가능 : p1.strChild="data"; p1.method03();

        // 부모 클래스의 인스턴스 변수를 자식 클래스로 캐스팅
        // Child c1 = new Child 와 똑같음
        Child c1 = (Child) p1;
        c1.strChild = "child";
        c1.method03();

        //
        c1.strParent = "child-parent";
        c1.method01();
        c1.method02();

        Parent p2 = new Parent();
        if(p2 instanceof Child){
            Child c2 = (Child)p2;
        }else {
            System.out.println("p2는 Child의 인스턴스가 아님");
        }
        Child c3 = (Child)p2; // 프로모션 되지 않은 인스턴스 변수를 캐스팅 하므로 오류가 남 -> java.lang.ClassCastingException
        c3.method01();
        c3.method02();
        c3.method03();
    }
}
