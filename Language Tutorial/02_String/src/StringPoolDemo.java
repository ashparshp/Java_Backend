public class StringPoolDemo {
    public static void main(String[] args) {
        String hello = "Hello";
        String hey = "Hello";
        System.out.println("isEqual: " + (hello == hey));

        String obj = new String("Hi!");
        String obj1 = new String("Hi!");
        System.out.println("isEqual: " + (obj == obj1));
    }
}