import java.util.Scanner;

class chinchiro2{
	public static void main(String[] args){
		int num;			//適当な数値
		int dice1,dice2;	//サイコロの目
		int sum;				//目の合計
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("好きな数を入力して下さい");
		
		num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.printf("入力値は、丁!\n\n");
		else
			System.out.printf("入力値は、半!\n\n");
		
		System.out.println("2つのサイコロを振ります");
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("サイコロ1:" + dice1);
		System.out.println("サイコロ2:" + dice2);
		
		sum = dice1 + dice2;
		
		System.out.println("合計:" + sum);
		
		if(sum % 2 == 0)
			System.out.printf("出目は、丁!\n\n");
		else
			System.out.printf("出目は、半!\n\n");
		
		if((num % 2 == 0 && sum % 2 == 0) || (num % 2 != 0 && sum % 2 != 0))
			System.out.printf("あなたの勝ち!");
		else
			System.out.printf("あなたの負け!");
	}
}