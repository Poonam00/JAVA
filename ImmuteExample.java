import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmuteExample {
	private final String name;
	private final  int age;
	private final List list;
	public ImmuteExample(String name,int age,List l) {
		this.name=name;
		this.age=age;
		this.list=new ArrayList(l);
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "ImmuteExample [name=" + name + ", age=" + age + ", list=" + list + "]";
	}
	public int getAge() {
		return age;
	}
	public List getList() {
		return Collections.unmodifiableList(list);
	}

}
