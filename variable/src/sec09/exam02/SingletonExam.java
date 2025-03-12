package sec09.exam02;

public class SingletonExam {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("같은 객체입니다");
        } else {
            System.out.println("다른 객체입니다");
        }
    }
}
