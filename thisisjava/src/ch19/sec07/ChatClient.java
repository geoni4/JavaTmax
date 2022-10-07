package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("대화명 입력: ");
			chatClient.chatName = scanner.nextLine();
			
			//json 데이터를 string으로 변환해서 전송
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
			
			String json = jsonObject.toString();
			
			chatClient.send(json);
			
			//데이터 받기
			chatClient.receive();
			
			System.out.println("-------------------------------");
			System.out.println("보낼 메시지를 입력하고 Enter");
			System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
			System.out.println("-------------------------------");
			
			while(true) {
				String message = scanner.nextLine();
				if(message.toLowerCase().equals("q")) break;
				
				jsonObject = new JSONObject();
				jsonObject.put("command", "message");
				jsonObject.put("data", message);
				json = jsonObject.toString();
				chatClient.send(json);
			}
			
			scanner.close();
			chatClient.unconnect();
			
		} catch(Exception e) {
			
		}
	}
	
	//필드
	Socket socket;			//통신
	DataInputStream dis;	//데이터 입력
	DataOutputStream dos;	//데이터 출력
	String chatName;		//클라이언트 명
	
	//서버 연결
	public void connect() throws IOException {
		socket = new Socket("localhost", 50001);				//채팅 서버의 주소와 포트번호
		dis = new DataInputStream(socket.getInputStream());		//채팅 서버에서 InputStream 객체 얻기
		dos = new DataOutputStream(socket.getOutputStream());	// 채텅 서버에서 OutputStream 객체 얻기
		
		System.out.println("[클라이언트] 서버에 연결됨");
	}//connect()
	
	//JSON data 받기
	public void receive() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						String json = dis.readUTF();
						JSONObject root = new JSONObject(json);
						String clientIp = root.getString("clientIp");
						String chatName = root.getString("chatName");
						String message = root.getString("message");
						System.out.println("<" + chatName + "@" + clientIp + ">");
					}
				}catch(Exception e){
					System.out.println("[클라이언트] 서버 연결 끊김");
					System.exit(0);
				}
			}
		}) ;
		thread.start();
	}//receive()
	
	//json 데이터 보내기
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}//send()
	
	//연결 종료
	public void unconnect() throws IOException {
		socket.close();
	}//unconnect()
	
}
