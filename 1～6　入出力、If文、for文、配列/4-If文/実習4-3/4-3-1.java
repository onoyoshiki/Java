import java.util.Scanner;

class tokuten{
	public static void main(String[] args){
		int point;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("“¾“_‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢B");
		point = input.nextInt();
		
		switch(point){
			case (point < 40):
			System.out.printf("¬Ñ‚ÍF‚Å‚·");
			case (point < 60):
			System.out.printf("¬Ñ‚ÍÄŒ±‚Å‚·");
		}
	}
}