import java.util.Scanner;

class hanbai{
	public static void main(String[] args){
		double price;		//�̔����i
		double coreprice;		//�{�̉��i
		double tax;			//�����
		double itax;			//int�����
		
		Scanner input = new Scanner(System.in);
		
		tax = 0.08;
		
		System.out.println("�̔����i����͂��Ă�������:");
		price = input.nextInt();
		
		coreprice = price - price*tax;
		
		itax = coreprice*tax+0.5;
		price -= itax;
		
		System.out.printf("�{�̉��i: %.0f\n" , price);
		System.out.printf("�����: %.0f " , itax);
	}
}