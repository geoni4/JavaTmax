package ch08.sec11.exam03;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		System.out.println("---------------------------");
			Vehicle[] vs = {new Taxi(), new Bus()};
			for(Vehicle v:vs){
				driver.drive(v);
			}
	}
}
