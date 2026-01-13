package variable;

public class InstanceVariable {
	
	int a=10; //instance variable
	int b=20;
	int c=30;
	public static void main(String[] args) { 
		// static area so we need to create object then use the instance variable
		// execution will start from main method
		InstanceVariable t= new InstanceVariable();
		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();	
	}
	void m1() // instance method we can use the instance variable directly 
	{
	System.out.println(c);
	}
}
