package Practise;

public class Main {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1.hashCode());
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2.hashCode());


	}
}
