package sec11.exam04;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane sa =  new SupersonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flymode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flymode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
