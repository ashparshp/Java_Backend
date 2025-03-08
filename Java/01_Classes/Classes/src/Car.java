public class Car {
    String model;
    String color;
    int horsePower;

    // Instance Initialization Block: It is always called whenever an object is created.
    {
        this.model = "BMW";
        this.color = "Black";
        this.horsePower = 200;
        System.out.println("Instance Initialization Block called");
    }

    public Car() {
        System.out.println("Car constructor called");
    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        System.out.println("Car constructor called");
    }

    public void startCar() {
        System.out.println("Vehicle started");
    }

    public String stopCar() {
        return "Vehicle stopped";
    }
}
