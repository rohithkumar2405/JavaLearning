import java.util.Scanner;

public class Calculation {
	
	int a , b ,c;
	static int d ;
	
	void sum (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		a = sc.nextInt();
		System.out.println("Enter the second number :");
		b = sc.nextInt();
		c = a+b ;
		d = c;
		System.out.println("Result:" + d);
	}
	
}
