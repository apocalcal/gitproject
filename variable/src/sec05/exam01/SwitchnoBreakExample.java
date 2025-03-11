package sec05.exam01;

public class SwitchnoBreakExample {
    public static void main(String[] args) {
       int time =  (int) ((Math.random()) * 4) + 8;
        System.out.println("[현재 시간: " + time + " 시]");

        switch(time) {
            case 8:
                System.out.println("출근한다.");
            case 9:
                System.out.println("회의한다.");
            case 10:
                System.out.println("업무본다.");
            default:
                System.out.println("외근간다.");

        }
    }
}
