import java.util.Scanner;

class moon{
	public static void main(String[] args){
		double speed;	//速度
		double dload;	//距離
		int iload;		//int型距離
		int hour;		//時間
		int time;		//分
		int second;		//秒
		int res;		//計算結果
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("速度を入力してください:");
		speed = input.nextDouble();
		dload = 3.85E5;
		iload = (int)dload;
		
		res = (int)(iload / speed);
		
		hour = res/3600;
		time = res/60 - hour*60;
		second = res - (hour*60 + time)*60;
		
		System.out.printf("月への飛行時間は、%d時間%d分%d秒です。" ,hour,time,second);
	}
}