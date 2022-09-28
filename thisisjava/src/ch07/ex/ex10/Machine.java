package ch07.ex.ex10;

public abstract class Machine{
	public void powerOn(){}
    public void powerOff(){}
    public abstract void work();
}


class Computer extends Machine{
	public void work() {
		
	}
}