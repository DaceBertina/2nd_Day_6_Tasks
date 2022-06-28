package task_6;

import java.util.Scanner;

public class Task_6 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean inputIsCorrect = false;
		int num1 = 0;
		int num2 = 0;
		do {
			try {
				System.out.println("Please enter 2 whole numbers.\n" +
						"Use a comma and whitespace as delimiter.");	
				String numbers = input.nextLine();
				String [] nums = numbers.split(", ");
				num1 = Integer.parseInt(nums [0]);
				num2 = Integer.parseInt(nums [1]);
				inputIsCorrect = true;
			} catch (Exception e) {
				System.out.println("Error occurs. Please try again.");	
			}		
		} while (inputIsCorrect == false);
		input.close();

		System.out.println(num1 == num2 || num1 < 0 && num2 > 0 || num1 > 100 && num2 > 100);
	}

}
