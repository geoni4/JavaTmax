package ch07.sec10.exam01;

public abstract class Phone {
	String owner = "string";
	
	
	abstract int turnOn();
	
	abstract void turnOff();
}

class SmartPhone extends Phone{

	@Override
	int turnOn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		
	}

	
}
