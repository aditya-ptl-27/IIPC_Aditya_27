import java.util.Scanner;

public class ave_grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Maths marks: ");
        int maths = scanner.nextInt();

        System.out.println("Enter your Physics marks: ");
        int physics = scanner.nextInt();

        System.out.println("Enter your Chemistry marks: ");
        int chemistry = scanner.nextInt();

        int sum = maths + physics + chemistry;
        double average = sum / 3;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("The sum of all the subjects is " + sum);
        System.out.println("The average of all the subjects is " + average);
        System.out.println("Your grade is " + grade);
    }
}
