public  class CarMain {

    static {
        System.out.println("Static main block called");
    }

    public static void main(String[] args) {

        System.err.println("Main method called");

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("Car 1: " + car1.model + " " + car1.color + " " + car1.horsePower + " " + car1.totalWheels);
        System.out.println("Car 2: " + car2.model + " " + car2.color + " " + car2.horsePower);

        System.out.println(car1.totalWheels);
        car1.totalWheels = 6; // Changes the value of totalWheels for all objects of the class.
        System.out.println(car1.totalWheels);
        System.out.println(car2.totalWheels);

        System.out.println(Car.noOfEngines);
    }
}