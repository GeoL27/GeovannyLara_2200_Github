/**********
 * 
 * @author Geovanny Lara
 * Date: 11/11/2022
 *
 */

import java.util.Scanner;

public class Exercise06_37 {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an intenger: ");
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();

		System.out.println("The number formatted is " + format(number,width));
		
		input.close();
			
	}


	public static String format(int number, int width) {
		String result = number + ""; 
		
		if (result.length() < width) {
			for (int i = width - result.length(); i > 0; i--) {
				result = "0" + result;
			}
		}
		return result;
	}
}