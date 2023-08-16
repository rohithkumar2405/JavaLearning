
public class B extends A{

	int a ;
	
	void Display() {
		System.out.println("It's B");
		super.Display();
		a = 20;
		super.a = 30 ;
		int c = super.a + a ;
		System.out.println(c);
	}
	
	B(){
		System.out.println("It's a B constructor");
	}
	
	B(int a){
		super(10);
		System.out.println("It's a B Argument constructor");
	}
	
	
	
	public static void main(String[] args) {
		B b = new B(10);
//		b.Display();
	}
}
