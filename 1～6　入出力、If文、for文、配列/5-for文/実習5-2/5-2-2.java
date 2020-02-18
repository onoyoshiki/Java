import java.util.Scanner;

class uruu{
	public static void main(String[] args){
		int inp;	//“ü—Í”N
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("•\‚Ì‘å‚«‚³‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		inp = input.nextInt();
		
		for(int i=1; i <= inp; i++){
			for(int j=1; j <= inp; j++){
				System.out.printf("%4d ",i*j);
			}
			System.out.printf("\n");
		}
	}
}