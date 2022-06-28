package task_5;

import java.util.Scanner;

public class Task_5 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Please enter boolean value:");
		boolean val = input.nextBoolean();
		boolean valRev = !val;
		System.out.println("Opposite of " + "\"" + val + "\" is " + "\"" + valRev +  "\".");
		input.close();
	}

}
