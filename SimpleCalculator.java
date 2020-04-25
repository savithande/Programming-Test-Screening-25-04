package com.sumofprimenumbers;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void calculation(char operator, double a, double b) {
		
		switch (operator) {
		case '+': System.out.println(a + b);
			break;
		case '-': System.out.println(a - b);
		break;
		case '*': System.out.println(a * b);
		break;
		case '/': System.out.println(a / b);
		break;

		default: System.out.println("!Error Operator is not correct");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the two numbers");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		System.out.println("Enter the Operator");
		char operator = scan.next().charAt(0);
		
		calculation(operator, a, b);
		
	}

}
