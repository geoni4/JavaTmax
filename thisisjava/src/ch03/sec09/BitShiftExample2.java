package ch03.sec09;

public class BitShiftExample2 {
	public static void main(String[] args) {
		int value = 772; // [00000000] [00000000] [00000011] [00000100]
		
		// 우측으로 3bytes(24bits) 이동하고 끝의 1byte만 읽음: [00000000]
		byte byte1 = (byte)(value >>> 24);
		System.out.println(Byte.toString(byte1));
		
		int int1 = byte1 & 255;
		
		System.out.println("첫 번째 바이트 부호없는 값: " + int1);
		
		byte byte2 = (byte)(value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호없는 값: " + int2);
		
		byte byte3 = (byte)(value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("세 번째 바이트 부호없는 값: " + int3);
		
		byte byte4 = (byte)(value);
		int int4 = byte4 & 255;
		System.out.println("네 번째 바이트 부호없는 값: " + int4);
	}
}
