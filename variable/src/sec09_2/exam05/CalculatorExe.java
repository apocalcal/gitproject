package sec09_2.exam05;

public class CalculatorExe {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double result1 = calc.areaRectangle(10); //정사각형
        
        double result2 = calc.areaRectangle(10, 20); //직사각형

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
