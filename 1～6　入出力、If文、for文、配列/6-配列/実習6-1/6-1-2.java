import java.util.Scanner;

class Fibo{
	public static void main(String[] args){
		long row;
		long array[] = new long[50];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i < array.length; i++){
			if(i < 2)
				array[i] = 1;
			else
				array[i] = (array[i-1])+(array[i-2]);
			System.out.printf("%2d€: %11d\n",i+1,array[i]);
		}
		
	}
}