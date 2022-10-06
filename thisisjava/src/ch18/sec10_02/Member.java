package ch18.sec10_02;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private String id;
	private transient String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
