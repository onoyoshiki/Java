import java.util.Scanner;

class tokuten{
	public static void main(String[] args){
		int point;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���_����͂��ĉ������B");
		point = input.nextInt();
		
		switch(point){
			case (point < 40):
			System.out.printf("���т�F�ł�");
			case (point < 60):
			System.out.printf("���т͍Ď����ł�");
		}
	}
}