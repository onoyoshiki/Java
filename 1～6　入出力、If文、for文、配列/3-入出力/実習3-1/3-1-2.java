import java.util.Scanner;

class moon{
	public static void main(String[] args){
		double speed;	//���x
		double dload;	//����
		int iload;		//int�^����
		int hour;		//����
		int time;		//��
		int second;		//�b
		int res;		//�v�Z����
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���x����͂��Ă�������:");
		speed = input.nextDouble();
		dload = 3.85E5;
		iload = (int)dload;
		
		res = (int)(iload / speed);
		
		hour = res/3600;
		time = res/60 - hour*60;
		second = res - (hour*60 + time)*60;
		
		System.out.printf("���ւ̔�s���Ԃ́A%d����%d��%d�b�ł��B" ,hour,time,second);
	}
}