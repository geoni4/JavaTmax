package ch05.sec11;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("lack of arguments");
			System.exit(0);
		}
		
		String[] strNums = new String[args.length];
		
		int nums[] = new int[args.length];
		for(int i =0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
			
			
		int result=0;
		for(int num:nums) {
			result += num;
			System.out.println(num);
		}
		System.out.println(result);
	}
}
