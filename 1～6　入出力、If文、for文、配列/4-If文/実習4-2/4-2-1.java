import java.util.Scanner;

class seireki{
	public static void main(String[] args){
		int year;
		int m,t,s,h,r;
		
		m = 1868;
		t = 1912;
		s = 1926;
		h = 1989;
		r = 2019;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("����������ɕϊ����܂��B");
		System.out.println("1868�N�ȍ~�̐���N����͂��ĉ������B");
		
		year = input.nextInt();
		
		if(year < t)
			System.out.printf("����"+ (year - m) +"�N�ł��B");
		else if(year < s)
			System.out.printf("�吳"+ (year - t) +"�N�ł��B");
		else if(year < h)
			System.out.printf("���a"+ (year - s) +"�N�ł��B");
		else
			System.out.printf("����"+ (year - h) +"�N�ł��B");
	}
}