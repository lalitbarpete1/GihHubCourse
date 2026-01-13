package variable;

public class VariabeAssignment1 {

	int a = 10;// instance variable
	int b = 20;// instance variable

	static void m1() { // static method
		VariabeAssignment1 obj = new VariabeAssignment1();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

	static void m2() {// static method
		
		VariabeAssignment1 obj2 = new VariabeAssignment1();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	}

	public static void main(String[] args) {

		VariabeAssignment1.m1(); // static method with the class name 
		VariabeAssignment1.m2(); // static method with the class name


	}
}