import java.util.Scanner;

class hukai{
	public static void main(String[] args){
		double temp,hum;
		double num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�C������͂��ĉ������B");
		temp = input.nextDouble();
		
		System.out.println("���x����͂��ĉ������B");
		hum = input.nextDouble();
		
		num = 0.81 * temp + 0.01 * hum * (0.99 * temp -14.3) +46.3;
		
		if(num < 55)
			System.out.printf("����");
		else if(num < 60)
			System.out.printf("������");
		else if(num < 75)
			System.out.printf("���K");
		else if(num < 80)
			System.out.printf("���s��");
		else if(num < 85)
			System.out.printf("�s��");
		else
			System.out.printf("���s��");
	}
}