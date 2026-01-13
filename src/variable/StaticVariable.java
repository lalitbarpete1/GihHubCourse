package variable;

public class StaticVariable {

	// 1. a variable which is declared inside the class but out side the method with
	// static modifier is called Instance variable.
	// 2. Static variable memory is allocated at the time of class loading.
	// 3. Scope: In the class.
	// 4. Static variable stored in non Heap memory.
	// 5. we can call using the class name

	static int a = 10;
	static int b = 20;
	static int c = 30;

	public static void main(String[] args) {

		System.out.println(a); // access the static variable directly
		System.out.println(StaticVariable.b); // access the static variable with class name
		StaticVariable t = new StaticVariable();
		System.out.println(t.c); // access the static variable using the object creation
		t.m1();
	}

	void m1() {
		System.out.println(c);
	}

}
