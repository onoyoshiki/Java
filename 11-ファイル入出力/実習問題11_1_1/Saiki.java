import java.util.Scanner;

public class Saiki {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("‘˜a‚ÆŠKæ");
		int num = scan.nextInt();
		
		System.out.println(Calc(num));
		System.out.println(Calc2(num));
	}
	
	public static int Calc(int x){
		if(x == 1)
			return 1;
		else
			return x + Calc(x - 1);
	}
	
	public static long Calc2(int x) {
		if(x == 1)
			return 1;
		else
			return x * Calc2(x - 1);
	}
}