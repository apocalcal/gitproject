package sec11.exam03;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 호출");
        return Math.PI * r * r;
    }
}