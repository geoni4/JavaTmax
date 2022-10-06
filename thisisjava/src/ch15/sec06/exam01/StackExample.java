package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기 push()
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//꺼내기 pop()
		while(!coinBox.isEmpty()) {
			System.out.println(coinBox.peek());//제일 위에 있는 개체 집기
			Coin coin = coinBox.pop();// 삭제하기
			
		}
	}
}
