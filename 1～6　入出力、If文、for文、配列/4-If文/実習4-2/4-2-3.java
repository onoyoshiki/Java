import java.util.Scanner;

class taxi{
	public static void main(String[] args){
		double m,km,sum;
		long num;
		int res;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("��������͂��ĉ������B");
		km = input.nextDouble();
		m = km * 1000;
		
		sum = ((m-2000)/274);
		num = Math.round(sum);
		res = 80 * (int)num + 660;
		
		if(m < 2000)
			System.out.printf("���s����%.2f�̃^�N�V�[������660�~�ł�",km);
		else
			System.out.printf("���s����%.2f�̃^�N�V�[������%d�ł�",km,res);
	}
}