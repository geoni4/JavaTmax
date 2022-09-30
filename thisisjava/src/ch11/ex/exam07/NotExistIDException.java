package ch11.ex.exam07;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message){
		super(message);
	}
}
