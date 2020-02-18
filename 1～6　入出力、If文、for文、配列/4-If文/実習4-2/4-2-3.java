import java.util.Scanner;

class taxi{
	public static void main(String[] args){
		double m,km,sum;
		long num;
		int res;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("距離を入力して下さい。");
		km = input.nextDouble();
		m = km * 1000;
		
		sum = ((m-2000)/274);
		num = Math.round(sum);
		res = 80 * (int)num + 660;
		
		if(m < 2000)
			System.out.printf("走行距離%.2fのタクシー料金は660円です",km);
		else
			System.out.printf("走行距離%.2fのタクシー料金は%dです",km,res);
	}
}