
public class Sample {
	
	
	public static void main (String args[]) {
		
		int num1 = 10 ;
		int num2 = 20 ;
		
		int num3 = 30 ;
		int num4 = 40 ;
		
		Sum s1 = new Sum();
		Sum s2 = new Sum();
		
		s1.calculateSum(num1, num2);
		s1.display();
		
		s2.calculateSum(num3, num4);
		s2.display();
		
	}

}
