package ch06.sec11;

public class Earth {
	//상수
	static final double EARTH_RADIUS = 6400;
	
	//상수
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.pow(EARTH_RADIUS, 2) * Math.PI;
	}
	public static void main(String[] args) {
		System.out.println(Earth.EARTH_SURFACE_AREA);
	}
}
