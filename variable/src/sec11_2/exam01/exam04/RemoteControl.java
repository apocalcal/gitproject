package sec11_2.exam01.exam04;

public interface  RemoteControl {
    int MAX_VOLUME = 10; //static final
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    void getVolume();
}
