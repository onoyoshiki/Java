import java.util.Scanner;

class tokuten{
	public static void main(String[] args){
		int point;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("得点を入力して下さい。");
		point = input.nextInt();
		
		switch(point){
			case (point < 40):
			System.out.printf("成績はFです");
			case (point < 60):
			System.out.printf("成績は再試験です");
		}
	}
}