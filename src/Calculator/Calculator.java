package Calculator;

import java.util.Scanner;

public class Calculator {
	public float calculatorFrame;
	public float firstNumber;
	public float secondNumber;
	public float result;
	public int operator;
	public Scanner input = new Scanner(System.in);
	public boolean exitCalculator = false;
	public void startCalculator() {
		while (!exitCalculator) {
			
			System.out.println("Enter 1 for addition \n"
					+ "Enter 2 for subtraction \n"
					+ "Enter 3 for multiplication \n"
					+ "Enter 4 for division \n" + "Enter 0 for Exit :");
			operator = input.nextInt();
			
			switch (operator) {
			case 1:
				result = add();
				System.out.println("Result is " + result);
				break;
				
			case 2:
				result = subtract();
				System.out.println("Result is " + result);
				break;
				
			case 3:
				result = multiply();
				System.out.println("Result is " + result);
				break;
				
			case 4:
				result = divid();
				System.out.println("Result is " + result);
				break;
			}
			
		}
		
	}
	public float add() {
		System.out.println("Enter the first number : ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number : ");
		secondNumber = input.nextInt();
		return firstNumber + secondNumber;
	}	

	public float subtract() {
		System.out.println("Enter the first number : ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number : ");
		secondNumber = input.nextInt();
		return firstNumber - secondNumber;
	}
	public float multiply() {
		System.out.println("Enter the first number : ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number : ");
		secondNumber = input.nextInt();
		return firstNumber * secondNumber;
	}
	public float divid() {
		System.out.println("Enter the first number : ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number : ");
		secondNumber = input.nextInt();
		return firstNumber / secondNumber;
}
	
}
