public class MethodInvocationDemo {
    public static void main(String[] args) {
        System.out.println("Main Method");
        MethodInvocationDemo obj = new MethodInvocationDemo();
        obj.method1();
    }

    public void method1() {
        int number = 10;
        System.out.println("Method 1");
        String output = method2();
        System.err.println("Output: " + output);
    }

    public String method2() {
        String output = "Hello World";
        System.out.println("Method 2");
        method3("Hello");
        return output;
    }

    public void method3(String input) {
        System.out.println(input);
        System.out.println("Method 3");
        method4(10);
    }

    public void method4(int number) {
        System.err.println(number);
        System.out.println("Method 4");
    }
    
}