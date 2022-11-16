/***********
 * Author: Geovanny Lara
 * Date: 11/16/22
 */
import java.util.Scanner;

public class Exercise06_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Display and integer reversed:");
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		reverse(number);
		
		input.close();
	}

	public static void reverse(int n) {
		
		if(n < 0) {
			System.out.print("-");
			reverse (n * -1);
		}
		
				
		else if (n < 10) {
			System.out.print(n);
		}
		else {
				System.out.print((n % 10));
				reverse (n / 10);
	}
}
}