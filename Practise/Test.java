package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class A{
	String name;

	@Override
	public int hashCode() {
		 Random rand = new Random(); 
	       int rand_int1 = rand.nextInt(1000); 
		return rand_int1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}
class B{
	int age;
	@Override
	public int hashCode() {
			return 125697;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}
}
public class Test {

	public static void main(String[] args) {
	
		A A1=new A();
		A A2=new A();
		A A3=new A();
		B B1=new B();
		B B2=new B();
		B B3=new B();

		Map map=new HashMap<>();
		map.put(A1, null);
		map.put(A2, null);
		map.put(A2, null);
		map.put(B1, null);
		map.put(B2, null);
		map.put(B3, null);


		System.out.println(map.size());
		System.out.println(map);
	}
}
