import java.util.Scanner;

class hanbai{
	public static void main(String[] args){
		double price;		//”Ì”„‰¿Ši
		double coreprice;		//–{‘Ì‰¿Ši
		double tax;			//Á”ïÅ
		double itax;			//intÁ”ïÅ
		
		Scanner input = new Scanner(System.in);
		
		tax = 0.08;
		
		System.out.println("”Ì”„‰¿Ši‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		price = input.nextInt();
		
		coreprice = price - price*tax;
		
		itax = coreprice*tax+0.5;
		price -= itax;
		
		System.out.printf("–{‘Ì‰¿Ši: %.0f\n" , price);
		System.out.printf("Á”ïÅ: %.0f " , itax);
	}
}