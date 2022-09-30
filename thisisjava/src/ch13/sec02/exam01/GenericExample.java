package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<>();
		
		product1.setKind(new TV());
		product1.setModel("Smart TV");
		
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tv + ": " + tvModel);
		
	}
}
