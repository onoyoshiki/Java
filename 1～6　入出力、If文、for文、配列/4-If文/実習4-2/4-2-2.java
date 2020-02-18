import java.util.Scanner;

class hukai{
	public static void main(String[] args){
		double temp,hum;
		double num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("気温を入力して下さい。");
		temp = input.nextDouble();
		
		System.out.println("湿度を入力して下さい。");
		hum = input.nextDouble();
		
		num = 0.81 * temp + 0.01 * hum * (0.99 * temp -14.3) +46.3;
		
		if(num < 55)
			System.out.printf("寒い");
		else if(num < 60)
			System.out.printf("肌寒い");
		else if(num < 75)
			System.out.printf("快適");
		else if(num < 80)
			System.out.printf("やや不快");
		else if(num < 85)
			System.out.printf("不快");
		else
			System.out.printf("超不快");
	}
}