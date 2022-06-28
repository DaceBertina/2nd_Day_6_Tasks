package task_2;

import java.util.Scanner;

public class Task_2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Converting inputs to boolean values:
		boolean valB1 = false;
		boolean valB2 = false;
		
		System.out.println("Please enter boolean value1 (on your choice: 'true' or 'false'):");
		valB1 = input.nextBoolean();
		
		System.out.println("Please enter boolean value2 (on your choice: 'true' or 'false'):false");
		valB2 = input.nextBoolean();
		
		System.out.println("Is " + valB1 + " equals to " + valB2 + "? - " + (valB1 == valB2));
		
		//Checking String inputs:
		forStrings();
	}
	
	static void forStrings() {
		boolean inputIsCorrect = false;
		String val1 = "";
		String val2 = "";
		do {
			try {
				System.out.println("Please enter boolean value (on your choice: e.g., true/false or true/true).\n" +
						"As delimeter use comma and whitespace, use lowercase letters.");
				String values = input.nextLine();
				String [] vals = values.split(", ");
				if (vals [0].equals("true") || vals [0].equals("false") && vals [1].equals("true") || vals [1].equals("false")) {
					val1  = vals [0];
					val2 = vals [1];
					inputIsCorrect = true;	
					} else {
						System.out.println("Check if the values are entered correctly.");
					}	
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Error occurs. Please try again.");	
				}		
		} while (inputIsCorrect == false);
		input.close();
		System.out.println("Is " + val1 + " equals to " + val2 + "? - " + ( val1.equals(val2) ? true : false)+ "\n");
	}
	
}
