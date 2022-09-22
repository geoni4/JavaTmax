package ch05.sec12;

public class MainExample {
	public static void main(String[] args) {
		//ms1 = new MySingleTon();
		//ms2 = new MySingleTon();
		//ms3 = new MySingleTon();
		MySingleTon ms = null;
		ms = MySingleTon.getInstance();
		ms.greet();
		
		MySingleTon ms1 = ms;
		MySingleTon ms2 = MySingleTon.getInstance();
		
	}
}
