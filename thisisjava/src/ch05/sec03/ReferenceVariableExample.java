package ch05.sec03;

public class ReferenceVariableExample {
	public static void main(String[] args) {
		//참조타입 변수명 = new 참조타입생성자();
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		int addressName1 = System.identityHashCode(name1);
		int addressName2 = System.identityHashCode(name2);
		System.out.println(addressName1);
		System.out.println(addressName2);
		
		//name2에 저장 돼있는 주소값을 name3에 저장
		String name3 = name2;
		System.out.println(System.identityHashCode(name3));
		
		
		// 연산자 == 변수 name1의 값과 name2의 값이 같은 지(참조하는 주소가 같은 지) 물어봄
		System.out.print("name1이 참조하는 객체의 주소는: "
						+ addressName1 +"이고, "
						+ "name2가 참조하는 객체의 주소는 "
						+ addressName2 +"로 ");
		if(name1 == name2) {
			System.out.print("같습니다.\n");
		} else {
			System.out.print("다릅니다.\n");
		}
		System.out.print("또, name2이 참조하는 객체의 주소는: "
				+ addressName1 +"이고, "
				+ "name3가 참조하는 객체의 주소는 "
				+ addressName2 +"로 ");
		if(name2 == name3) {
			System.out.print("같습니다.\n");
		} else {
			System.out.print("다릅니다.\n");
		}
		System.out.println("비교하는 객체가 동등한지 비교(equivalence");
		System.out.println("---------------");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		
	}
}
