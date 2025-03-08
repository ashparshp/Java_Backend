public class EmployeeMain {
    public static void main(String[] args) {
        
        /*
        // Default constructor
        Employee employee  = new Employee();
        employee.firstName = "John";
        employee.lastName = "Smith";
        employee.age = 24;
        employee.gender = 'M';
        */

        // Default constructor with default values
        Employee employee = new Employee();
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());

        // Constructor overloading
        Employee employee2 = new Employee("Ram", "Ji", (byte) 25, 'M');
        System.out.println(employee2.getFirstName());
        System.out.println(employee2.getLastName());
        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());

    }
}
