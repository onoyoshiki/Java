import java.util.Scanner;

class souwa{
	public static void main(String[] args){
		int point,sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("いくつまでの総和を求めますか");
		point = input.nextInt();
		
		sum = 0;
		
		for(int i=1; i <= point; i++){
			sum += i; 
		}
		System.out.println(sum);
	}
}