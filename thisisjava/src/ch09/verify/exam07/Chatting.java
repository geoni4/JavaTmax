package ch09.verify.exam07;

public class Chatting {
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) { // chatId는 fianl이 기본인데 생략되어있다.(java 8부터)
		String nickName = null; // 
		nickName = chatId;		// 바로 초기화 해줘야 됨
		
		Chat chat = new Chat() {//로컬 클래스의 메소드 내부에서 사용하는 로컬 변수는 사용하는 순간 final로 바뀜
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName +  "] " + inputData;
				}
			}
		}
	}
}
