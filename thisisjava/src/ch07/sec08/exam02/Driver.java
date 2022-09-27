package ch07.sec08.exam02;

public class Driver {
	//Vehicle 타입만 매개변수로 받음.
	public void drive(Vehicle vehicle) {
		vehicle.run();
		//이미 Bus타입을 부모 메소드인 vehicle로 타입변환을 한 것이므로 Taxi로는 접근이 안 됨
		if(vehicle instanceof Taxi) {	//원래 Taxi 객체로 만ㄷㄹ어져서 Vehicle로 변환돼 넘어왔는지 true/false
			Taxi taxi = (Taxi)vehicle;
		}else if(vehicle instanceof Bus){
			Bus bus = (Bus)vehicle;
		}
	}
}
