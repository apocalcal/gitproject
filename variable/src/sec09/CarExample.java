package sec09;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car();

        System.out.println("제조 회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색상: " + myCar.color);
        System.out.println("최고 속도: " + myCar.maxspeed);
        System.out.println("현재 속도: " + myCar.speed);

        // 필드 값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}
