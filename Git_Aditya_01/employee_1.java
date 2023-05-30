class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInformation() {
        System.out.printf("%-10s%-15d%-20s\n", name, yearOfJoining, address);
    }
}

public class employee_1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet");

        System.out.println("Name\t\tYear of Joining\tAddress");
        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
    }
}
