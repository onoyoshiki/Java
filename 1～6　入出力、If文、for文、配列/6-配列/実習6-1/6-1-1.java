import java.util.Scanner;

class acces{
	public static void main(String[] args){
		int max = 0;
		int min = 10000;
		int ave = 0;
		int monave = 0;
		
		int array[] = new int[12];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i < array.length; i++){
			System.out.printf("%2d月:",i+1);
			array[i] = input.nextInt();
		}
		
		
		for(int i=0; i < array.length; i++){
			if(max < array[i])
				max = array[i];
			if(min > array[i])
				min = array[i];
			ave += array[i];
		}
		System.out.println("最高アクセス:" + max);
		System.out.println("最低アクセス:" + min);
		System.out.println("年間アクセス:" + ave);
	}
}