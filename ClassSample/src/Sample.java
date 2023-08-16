import java.util.Scanner;

public class Sample {
	
	int input1 , input2, sum ;
	
	void GetInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		input1 = sc.nextInt();
		System.out.println("Enter the second number:");
		input2 = sc.nextInt();	
	}
	
    void DisplaySum() {
    	sum = input1 + input2;
		System.out.println("Result is : " + sum);
	}
}




