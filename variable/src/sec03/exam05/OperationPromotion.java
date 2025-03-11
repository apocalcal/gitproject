package sec03.exam05;

public class OperationPromotion {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        int intValue1 = byteValue1 + byteValue2;
        System.out.println("intValue1 = " + intValue1);
        
        char charValue1 = 'A';
        char charValue2 = 1;
        int intValue2 = charValue1 + charValue2;
        System.out.println("intValue2 = " + intValue2);
        
        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println("intValue4 = " + intValue4);
        
        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println("result = " + result);
    }
}
