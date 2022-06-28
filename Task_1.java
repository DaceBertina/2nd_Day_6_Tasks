package task_1;

import java.util.Scanner;

public class Task_1 {

	static Scanner input = new Scanner(System.in);
	static int a;
	static int b;
	
	public static void main(String[] args) {
		
		boolean inputIsCorrect = false;
		do {
			try {
				System.out.println("Please enter 2 numbers, separate by comma and whitespace.");
				String numbers = input.nextLine();
				String [] nums = numbers.split(", ");
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);
				// Aizkomentēts mēģinājums sagaidīt input-u 2 rindiņās, bet konsole neklausa... Tokenizer mēģinājumu izdzēsu.
				/*String numbers = input.nextLine();
				String [] nums = numbers.split("\n");
				String [] numsA = nums[0].split(" ");
				String [] numsB = nums[1].split(" ");
				a = Integer.parseInt(numsA [numsA.length - 1]);
				b = Integer.parseInt(numsA [numsB.length - 1]); */
				inputIsCorrect = true;	
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter the correct numbers.");
			}	
			catch (Exception e) {
				System.out.println("Error occurs. Please try again.");	
			}		
		} while (inputIsCorrect == false);
		input.close();
		
		//Salīdzinām a un b vērtības, izmantojam ternary operator, kompilējam izdruku:
		String info = "";
		info += "Is " + a + " equal to " + b + "? - " + ( a == b ? true : false)+ "\n";
		info += "Is " + a + " less than " + b + "? - " + ( a < b ? true : false) + "\n";
		info += "Is " + a + " less or equal to " + b + "? - " + ( a <= b ? true : false) + "\n";
		info += "Is " + a + " greater than " + b + "? - " + ( a > b ? true : false) + "\n";
		info += "Is " + a + " greater or equal to " + b + "? - " + ( a >= b ? true : false) + "\n";
		System.out.println(info);
	}
}
