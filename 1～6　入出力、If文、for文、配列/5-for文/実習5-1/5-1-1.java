import java.util.Scanner;

class souwa{
	public static void main(String[] args){
		int point,sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�����܂ł̑��a�����߂܂���");
		point = input.nextInt();
		
		sum = 0;
		
		for(int i=1; i <= point; i++){
			sum += i; 
		}
		System.out.println(sum);
	}
}