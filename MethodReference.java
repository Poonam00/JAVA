//Method reference
public class MethodReference {
	public static void main(String[] args) {
		new MethodReference().callMethodRef();
		
	}

	public void callMethodRef() {
		//method ref of arbratry obj
		ArbtraryInterf a=MethodReference::methRefArbtrary;
		int res=a.m1(new MethodReference(), 1);
		System.out.println(res);

		//method ref of static method
		StaticInterf s=MethodReference::methRefStatic;
		s.m2();

		//method ref of object type method
		ObjRef o=new MethodReference()::methRefObjRef;
		o.m3();
	}

	public int methRefArbtrary(int s) {
		System.out.println("inside methRefArbtrary()");
		return 0;
	}

	public static int methRefStatic() {
		System.out.println("inside methRefStatic()");
		return 1;
	}
	public  int methRefObjRef() {
		System.out.println("inside methRefObjRef()");
		return 1;
	}
}

interface ArbtraryInterf {
	int m1(MethodReference t,int s);
}
interface StaticInterf{
	int m2();
}
interface ObjRef{
	int m3();
}