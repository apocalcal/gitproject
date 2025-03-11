package sec07;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
//        int[] scores = {83, 90, 87};
//
//        System.out.println("scores[0] = " + scores[0]);
//
//        int sum = 0;
//
//        for(int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        System.out.println("sum = " + sum);
//        double avg = sum / scores.length;
//        System.out.println("avg = " + avg);
        int[] scores;
        scores = new int[] {80, 99, 91};
        System.out.println("scores[0] = " + scores[0]);

        int sum = 0;

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum = " + sum);
        double avg = sum / scores.length;
        System.out.println("avg = " + avg);
    }
}
