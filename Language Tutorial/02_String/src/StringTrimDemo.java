public class StringTrimDemo {
    public static void main(String[] args) {
        String myString1 = "   Hello, World!   ";
        String myString2 = "\n   Hello, World!   \n"; 
        String myString3 = "\t   Hello, World!   \t";
        String myString4 = "\r\n   Hello, World!   \r\n";
        
        // Trim the string
        String trimmedString = myString1.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}