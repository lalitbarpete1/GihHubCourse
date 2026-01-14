package variable;

public class InstanceVsStatic {

	int a = 10; // instance variable
	static int b = 20; // static variable

	public static void main(String[] args) {

		// static area
		System.out.println(b); // direct call static -> static
		System.out.println(InstanceVsStatic.b); // using class name

		InstanceVsStatic obj1 = new InstanceVsStatic();

		System.out.println(obj1.b); // using object

		obj1.a = 100;
		obj1.b = 200;
		System.out.println(obj1.a); // using object  //100
		System.out.println(obj1.b); // using object //200 
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println(obj2.a); // using object //10
		System.out.println(obj2.b); // using object // 200
		
		obj2.b = 400;

		InstanceVsStatic obj3 = new InstanceVsStatic();
		System.out.println(obj3.a); // using object  //10 
		System.out.println(obj3.b); // using object //400
	}

}
