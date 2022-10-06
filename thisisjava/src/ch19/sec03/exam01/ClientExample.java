package ch19.sec03.exam01;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 5001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
