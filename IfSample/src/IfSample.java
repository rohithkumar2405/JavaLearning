import java.util.Scanner;

public class IfSample {
	public static void main(String a[ ]) {
		System.out.println("Enter a number : ");	
		Scanner pn = new Scanner(System.in);
		int num = pn.nextInt();
		if (num < 0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is positive");
		}
	}
}
