package sec01.exam01;

public class Longoperation {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3; // long 타입이 가장 범위가 넓기에 연산 결과는 long 타입으로 반환
        System.out.println("result = " + result);
    }
}
