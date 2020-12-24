package Practise;

import java.io.Serializable;

//lazy loading
public class Singleton implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile Singleton INSTANCE;// make atomic

	// to avoid Reflection leakage
	private Singleton() {
		if (INSTANCE == null) {
			throw new RuntimeException("Cannot intialize object in contructor. Use getInstance()");
		}
	}

	// thread safe
	public static Singleton getInstance() {

		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}

		}
		return INSTANCE;
	}

	protected Singleton readResolve() {
		return INSTANCE;
	}

	protected Singleton clone() {
		return INSTANCE;
	}
}
