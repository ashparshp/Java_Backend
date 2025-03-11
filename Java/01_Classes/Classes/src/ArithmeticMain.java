public class ArithmeticMain {
    public static void main(String[] args) {
        int resultFromStaticMethod = ArithmeticOperations.addition(20, 9);
        System.out.println("Addition: " + resultFromStaticMethod);

        System.out.println("PI: " + ArithmeticOperations.PI);

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int resultFromInstanceMethod = arithmeticOperations.sum(20, 9);
        System.out.println("Subtraction: " + resultFromInstanceMethod);

        System.out.println("PI: " + arithmeticOperations.pi);
        
    }
}