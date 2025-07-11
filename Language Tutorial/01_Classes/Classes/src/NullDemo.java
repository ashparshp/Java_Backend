public class NullDemo {
    public static void main(String[] args) {
        // int number = null; // Compile-time error
        String str = null; // OK
        System.out.println(str);

        Employee employeeObj = null; // OK
        // int age = employeeObj.getAge(); // NullPointerException
        System.gc(); // Request to JVM to run Garbage Collector
    }
}