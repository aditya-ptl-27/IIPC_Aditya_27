
//public class ternary_01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

//package new_java;
import java.util.Scanner;

public class ternary_01 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two numbers: ");
	        int number1 = scanner.nextInt();
	        int number2 = scanner.nextInt();

	        int biggerNumber = (number1 > number2) ? number1 : number2;
	        System.out.println("The bigger number is " + biggerNumber);
	}

}