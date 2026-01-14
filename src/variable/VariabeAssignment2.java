package variable;

public class VariabeAssignment2 {

	int age = 10; // instance variable
	int mark = 20; // instance variable
	static int c = 30; // static variable
	static int d = 40; // static variable

	void m1() {
		System.out.println(age);
		System.out.println(mark);
		System.out.println(VariabeAssignment2.c);
		System.out.println(VariabeAssignment2.d);

	}

	static void m2()

	{
		VariabeAssignment2 obj1 = new VariabeAssignment2();

		System.out.println(obj1.age);
		System.out.println(obj1.mark);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		VariabeAssignment2 obj2 = new VariabeAssignment2();
		obj2.m1();
		m2();

	}
}
