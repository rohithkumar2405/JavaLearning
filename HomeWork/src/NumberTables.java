import java.util.Scanner;

public class NumberTables {

	public static void main(String[] args) {
		System.out.println("Enter the number to be multiplied :");
		Scanner num = new Scanner(System.in);
		int multiplier = num.nextInt();
		int Result = 0;
		for (int i=1;i<=10;i++) {
			Result = i*multiplier;
			System.out.println(i+"x"+multiplier+"="+Result);
		}
	}	
}


