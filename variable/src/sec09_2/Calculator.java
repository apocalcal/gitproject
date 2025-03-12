package sec09_2;

public class Calculator {
    void poweron() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divide(int x, int y) {
        return (double) x / y;
    }

    void poweroff() {
        System.out.println("전원을 끕니다.");
    }
}
