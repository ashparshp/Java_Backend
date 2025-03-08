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

        // Constructor chaining
        Employee employee3 = new Employee("Shyam", "Ji");
        System.out.println(employee3.getFirstName());
        System.out.println(employee3.getLastName());
        System.out.println(employee3.getAge());
        System.out.println(employee3.getGender());

        // Static field
        System.out.println(Employee.companyName);
        System.out.println(employee.companyName);
        employee.companyName = "Facebook";
        System.out.println(Employee.companyName);

        // Constant
        System.out.println(Employee.MAX_AGE);
        System.out.println(employee.MAX_AGE);
        // employee.MAX_AGE = 70; // Error: cannot assign a value to final variable MAX_AGE


    }
}
