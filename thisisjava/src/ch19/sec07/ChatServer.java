package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.json.JSONObject;

public class ChatServer {
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();
			
			System.out.println("----------------------------");
			System.out.println("서버를 종료하려면 q를 입력하고 Enter");
			System.out.println("----------------------------");
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				String key = scanner.nextLine();
				if(key.equalsIgnoreCase("q")) break;
			}
			scanner.close();
			chatServer.stop();
			
		} catch(Exception e) {
			System.out.println("[서버] " + e.getMessage());
		}
	}
	
	
	//필드
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<String, SocketClient>()) ;
	
	//메소드 서버시작
	public void start() throws IOException{
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		
		Thread thread = new Thread(() -> {
			try {
				while (true) {
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);
				}
			} catch (Exception e) {

			}
		});
	}//start()
	
	//클라이언트 연결 종료 시
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIP;
		chatRoom.remove(key);
		System.out.println("나감: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + '\n');
	}//removeSocketClient
	
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIP;
		chatRoom.put(key, socketClient);
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + '\n');
	}//addSocketClient
	
	
	//모든 클라이언트에게 메시지 전송
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIP);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc: socketClients) {
			if(sc==sender) continue;	//전송자 제외
			sc.send(json);				//나머지에게 전송
		}
	}//sendToAll();
	
	//서버 종료
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			chatRoom.values().stream()
					.forEach(t -> t.close());
			System.out.println("[서버] 종료됨");
		}catch (Exception e) {
			
		}
	}
	
	
}
