
public class yuuai {

	public static void main(String[] args) {
		int array[] = new int[args.length];
		for(int i=0; i<args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
			System.out.printf("%d\n",amicable(array[i]));
		}
	}
	
	static int amicable(int x) {
		int sum =0;
		for(int j=1; j<x; j++) {
			if(x % j == 0)
				sum += j;
		}
		return sum;
	}
}