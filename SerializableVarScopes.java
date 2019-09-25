import java.io.Serializable;

public class SerializableVarScopes implements Serializable{
	transient int age;
	static volatile String vola;
	static String staVar;
	String packVar;
	private String priVar;
	public String pubVar;
	protected String proVar;
	public SerializableVarScopes () {
		System.out.println("Employee constructor");
	}

}
