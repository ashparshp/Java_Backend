public class StringComparisionDemo {
    public static void main(String[] args) {
        String s1 = new String("Hi!");
        String s2 = new String("Hi!");
        String s3 = new String("Hello!");

        /* Compare Memory locations */
        System.out.println(s1 == s2);

        /* Compare Content */
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}