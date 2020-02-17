import java.util.Scanner;

class moon{
	public static void main(String[] args){
		double speed;	//‘¬“x
		double dload;	//‹——£
		int iload;		//intŒ^‹——£
		int hour;		//ŠÔ
		int time;		//•ª
		int second;		//•b
		int res;		//ŒvZŒ‹‰Ê
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("‘¬“x‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		speed = input.nextDouble();
		dload = 3.85E5;
		iload = (int)dload;
		
		res = (int)(iload / speed);
		
		hour = res/3600;
		time = res/60 - hour*60;
		second = res - (hour*60 + time)*60;
		
		System.out.printf("Œ‚Ö‚Ì”òsŠÔ‚ÍA%dŠÔ%d•ª%d•b‚Å‚·B" ,hour,time,second);
	}
}