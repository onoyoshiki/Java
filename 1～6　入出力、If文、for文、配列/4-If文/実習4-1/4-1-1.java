import java.util.Scanner;

class uruu{
	public static void main(String[] args){
		int year;	//入力年
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("西暦年を入力してください");
		year = input.nextInt();
		
		if(year % 4 == 0 || (year % 100 == 0 && (year % 400 != 0)))
			System.out.printf("%d年は閏年です",year);
		else
			System.out.printf("%d年は閏年ではありません",year);
	}
}