//import java.util.Scanner;

public class SampleAdder {

	public static void main(String[] args) {
		int num,sum;
		//Scanner input = new Scanner(System.in);
		sum = 0;
		//num = input.nextInt();
		for(int i=0; i<args.length; i++) {
			num = Integer.parseInt(args[i]);
			sum += num;
		}
		System.out.printf("%s", sum);
	}

}
