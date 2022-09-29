package ch12.sec03;

public class Member {
	public String id;
	int age;
	String address;
	String email;
	String phone;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
}
