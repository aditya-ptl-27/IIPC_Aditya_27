import java.util.Scanner;

//creating a class name student1
class Student {
	
	//it has this 4 members
    String name;
    int id;
    int age;
    String mobileNo;

    // this function is used to get the data from user
    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter ID: ");
        id = scanner.nextInt();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        System.out.print("Enter mobile number: ");
        scanner.nextLine(); // Consume the newline character
        mobileNo = scanner.nextLine();
    }
    
 // this function is used display the data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

public class Student {
    public static void main(String[] args) {
    	//creatinng a object of a local class student 1
        Student1 student = new Student1();
        student.getData();
        System.out.println("\nStudent Details:");
        student.display();
    }
}