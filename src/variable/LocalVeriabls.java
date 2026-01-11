package variable;

public class LocalVeriabls {

	public static void main(String[] args) { // main method 
		 
		int a =10;
		int b=20;
		System.out.println(a+b);
		
	}
	void m1 () // memory  allocated 
	{
		int a =6; //local variable 
		System.out.println(a); // possible 
	}	//memory  released 
	void m2 ()
	{
	//System.out.println(a); // not possible
	}

}
