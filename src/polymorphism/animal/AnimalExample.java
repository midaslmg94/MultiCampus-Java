package polymorphism.animal;

public class AnimalExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();
        Cat c1 = new Cat();
        c1.sound();
        Dog d1 = new Dog();
        d1.sound();
        Animal c2 = new Cat();
        Animal d2 = new Dog();
        c2.sound();
        d2.sound();
        Animal c3 = new CatBaby();
        Cat c4 = new CatBaby();
        c3.sound();
        c3.eat();
        c4.sound();
        c4.eat();
    }
}
