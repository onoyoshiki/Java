import java.util.Scanner;

class hanbai{
	public static void main(String[] args){
		double price;		//販売価格
		double coreprice;		//本体価格
		double tax;			//消費税
		double itax;			//int消費税
		
		Scanner input = new Scanner(System.in);
		
		tax = 0.08;
		
		System.out.println("販売価格を入力してください:");
		price = input.nextInt();
		
		coreprice = price - price*tax;
		
		itax = coreprice*tax+0.5;
		price -= itax;
		
		System.out.printf("本体価格: %.0f\n" , price);
		System.out.printf("消費税: %.0f " , itax);
	}
}