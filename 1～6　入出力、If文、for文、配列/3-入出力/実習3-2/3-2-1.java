import java.util.Scanner;

class casbyte{
	public static void main(String[] args){
		int num; 	//“ü—Í”’l
		long k,m,g,t;
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		k = (long)Math.pow(num,10);
		m = (long)Math.pow(num,20);
		g = (long)Math.pow(num,30);
		t = (long)Math.pow(num,40);
		
		System.out.printf("%dKByte = %4dByte\n",num,k);
		System.out.printf("%dMByte = %7dByte\n",num,m);
		System.out.printf("%dGByte = %10dByte\n",num,g);
		System.out.printf("%dTByte = %13dByte\n",num,t);
	}
}