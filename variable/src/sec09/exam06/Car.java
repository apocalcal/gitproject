package sec09.exam06;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxspeed;

    public Car() {
    }

    public Car(String model) {
        this(model, null, 0);
    }

    public Car(String model, String color) {
      this(model, color, 0);
    }

    public Car(String model, String color, int maxspeed) {
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
}
