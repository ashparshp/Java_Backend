public class EmptyCheckDemo {
    public static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty();
        isEmpty = myString.length()==0;
        isEmpty = "".equals(myString);

        String nullString = null;
        boolean isNullEmpty = "".equals(nullString);
        // isNullEmpty = nullString.length()==0; // Null pointer exception
        // isNullEmpty = nullString.isEmpty(); // Null pointer exception

        String blankString = "       ";
        boolean isBlank = myString.isBlank();
    }
}