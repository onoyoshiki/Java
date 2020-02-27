import java.util.Scanner;

public class ToggledCollatz {
	static int counter = 0;
	public static void main(String[] args) {
		int input;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("®”");
			input = scan.nextInt();
		}while(input<2);
		counter = myToggle(input);
		System.out.printf("\n%d‰ñ",counter);
	}
	
	public static int myToggle(int x){
		if(x != 1) {
			counter++;
			if(x % 2 == 0) {
				return myToggle(x/2);
			}
			else {
				return myToggle(3*x+1);
			}
		}
		else
			return counter;
	}
}