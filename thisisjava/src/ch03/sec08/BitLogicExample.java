package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + ~45);
		System.out.println(String.format("%8s",Integer.toBinaryString(45)).replace(" ","0"));
		System.out.println(String.format("%8s",Integer.toBinaryString(25)).replace(" ","0"));
		System.out.println(String.format("%8s",Integer.toBinaryString(~45)).replace(" ","0"));
	}

}
