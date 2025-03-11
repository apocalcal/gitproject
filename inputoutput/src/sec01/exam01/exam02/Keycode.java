package sec01.exam01.exam02;

import java.io.IOException;

public class Keycode {
    public static void main(String[] args) throws IOException {
        int keycode;
        while(true) {
            keycode = System.in.read();
            System.out.println("keycode = " + keycode);

            if(keycode == 113) break;
        }
        System.out.println("종료합니다.");
    }
}
