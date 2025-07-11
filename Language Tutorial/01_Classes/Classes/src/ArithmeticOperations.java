public class ArithmeticOperations {

    double pi = 3.14;
    static final double PI = 3.14;

    public static void main(String[] args) {

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int sum = arithmeticOperations.sum(5, 3);
        System.out.println("Sum: " + sum);


        int result = addition(5, 3);
        System.out.println("Result: " + result);

        System.out.println("PI: " + arithmeticOperations.pi);
        System.out.println("PI Static: " + PI);
    }

    public int sum(int a, int b) {
        System.err.println("PI: " + pi);
        System.err.println("PI Static: " + PI);
        return a + b;
    }

    public static  int addition(int a, int b) {
        return a + b;
    }

}
