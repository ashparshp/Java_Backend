public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;

    // Default constructor
    /* public Employee() {
        System.out.println("Employee constructor called");
    }
    */

    // Initialize constructor the fields with default values
    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
        this.gender = 'M';
        System.out.println("Employee constructor called");
    }

    // Constructor overloading
    public Employee(String firstName, String lastName, byte
    age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Constructor chaining
    public Employee(String firstName, String lastName) {
        this(firstName, lastName, (byte) 30, 'M');
    }

    // Getters
    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
}
