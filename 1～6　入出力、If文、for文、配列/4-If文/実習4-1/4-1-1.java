import java.util.Scanner;

class uruu{
	public static void main(String[] args){
		int year;	//���͔N
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("����N����͂��Ă�������");
		year = input.nextInt();
		
		if(year % 4 == 0 || (year % 100 == 0 && (year % 400 != 0)))
			System.out.printf("%d�N�͉[�N�ł�",year);
		else
			System.out.printf("%d�N�͉[�N�ł͂���܂���",year);
	}
}