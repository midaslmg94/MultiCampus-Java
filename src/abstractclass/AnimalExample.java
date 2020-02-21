package abstractclass;

public class AnimalExample {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.sound();
        Dog d1 = new Dog();
        d1.sound();
        System.out.println("=====");
// 오버라이딩
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
