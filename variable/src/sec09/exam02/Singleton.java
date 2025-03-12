package sec09.exam02;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}
    static Singleton getInstance() {
        return singleton;
    }
}
