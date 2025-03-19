package sec11_2.exam01.exam03;

public class AnimalEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        System.out.println("----------------------");

        Animal animal = null;
        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
        System.out.println("----------------------");

        //매개변수 자동 타입 변환
        animalsound(new Dog());
        animalsound(new Cat());
    }
    public static void animalsound(Animal animal) {
        animal.sound();
    }
}
