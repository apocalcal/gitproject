package sec09.exam05;

public class Car {
        String company = "현대자동차";
        String model = "그랜저";
        String color = "검정";
        int maxspeed = 350;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxspeed) {
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
}
