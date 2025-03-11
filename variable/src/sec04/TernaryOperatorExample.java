package sec04;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' :  'C');
        System.out.println(score + "점, " + grade + "학점");
    }
}
