public class InternMethodDemo {
    public static void main(String[] args) {
        String hello = "Hello";
        String obj = new String("Hello");
        System.out.println("isEqual: " + (hello == obj));
        obj = obj.intern();
        System.out.println("isEqual: " + (hello == obj));
    }
}