package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int operation;
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Operation: ");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		System.out.println("5: Exit");
		operation = scan.nextInt();
		System.out.println("Enter The First Number: ");
		num1 = scan.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = scan.nextInt();
		switch(operation) {
		case 1:
			add(num1, num2);
			break;
		case 2:
			subtract(num1, num2);
			break;
		case 3:
			multiply(num1, num2);
			break;
		case 4:
			divide(num1, num2);
			break;
		case 5:
			exit();
			break;
		default:
			System.out.println("Invalid, Try Again.");
			break;
		}
	}
	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	static void subtract(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	static void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	static void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	static void exit() {
		System.out.println("Goodbye!");
	}
}
