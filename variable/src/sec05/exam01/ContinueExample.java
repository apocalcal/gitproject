package sec05.exam01;

public class ContinueExample {
    public static void main(String[] args) {
        for(int m = 2; m <= 9; m++) {
            if(m % 2 == 0) {
                continue;
            }
            System.out.println(m);
        }
    }
}
