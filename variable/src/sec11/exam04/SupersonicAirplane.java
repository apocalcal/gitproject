package sec11.exam04;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flymode = NORMAL;

    @Override
    public void fly() {
        if(flymode == SUPERSONIC) {
            System.out.println("초음속 비행 도과자~");
        } else {
            super.fly();
        }
    }
}
