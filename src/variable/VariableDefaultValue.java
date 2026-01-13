package variable;

// instance variable JVM will assign default value 
// for static variable default value is provide by JVM 
// Local variable : default values are not assigned (before using we need to initialized the value)

public class VariableDefaultValue {
	
	
	int a;
	boolean b;
	static int c;
	
	
	public static void main(String[] args) {
		int d ;
		
		
		VariableDefaultValue obj = new VariableDefaultValue();	
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	//	System.out.println(d);
		d=10;
		System.out.println(d);
		
	}

}
