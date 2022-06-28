package task_3;

import java.util.Scanner;

public class Task_3 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean inputIsCorrect = false;
		int num = 0;
		do {
			try {
				System.out.println("Please enter a whole number.\n");	
				String number = input.nextLine();
				num = Integer.parseInt(number);
				inputIsCorrect = true;
			} catch (Exception e) {
				System.out.println("Error occurs. Please try again.");	
			}		
		} while (inputIsCorrect == false);
		System.out.println(( num % 2 == 0 ? true : false));
		input.close();
	}

}
