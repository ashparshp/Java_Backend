public  class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("Car 1: " + car1.model + " " + car1.color + " " + car1.horsePower + " " + car1.totalWheels);
        System.out.println("Car 2: " + car2.model + " " + car2.color + " " + car2.horsePower);

        System.out.println(car1.totalWheels);
        car1.totalWheels = 6;
        System.out.println(car1.totalWheels);
        System.out.println(car2.totalWheels);
    }
}