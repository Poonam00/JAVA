package Practise;
public class CovariantEx {
	Object o;
	String s;

	public void show(Object o) {
		System.out.println("Object's method");
	}

	public void show(String o) {

		System.out.println("String's method");
	}

/*	public void show(Integer o) {

		System.out.println("Integer's method");
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CovariantEx test = new CovariantEx();
		test.show(null);
		System.out.println(test.o + " " + test.s);
	}

}
/*
 * The method with the receiving parameter of type String has been invoked.
 * 
 * If more than one member method is both accessible and applicable to a method
 * invocation, it is necessary to choose one to provide the descriptor for the
 * run-time method dispatch. The Java programming language uses the rule that
 * the most specific method is chosen. Where you pass null as argument for an
 * overloaded method, the method chosen is the method with the most specialized
 * type, so in this case: String is chosen rather than the most tolerant:
 * Object.
 * 
 * Among Object/String/int the choice is clear for the compiler: you will get
 * the String’s one cause an int cannot be null and so its corresponding method
 * is not eligible to be called in this case.
 * 
 * But if you change int for Integer, compiler will be confuse because both
 * methods taking String is as accurate as Integer’s one (orthogonal in
 * hierarchy).
 */