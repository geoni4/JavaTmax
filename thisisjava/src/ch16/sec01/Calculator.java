package ch16.sec01;



//컴파일러에게 추상메소드가 하나인지 확인하라는 주석역할
@FunctionalInterface
public interface Calculator {
	void calculate(int x, int y);//함수형 인터페이스는 추상 메소드가 하나여야 한다.
}
