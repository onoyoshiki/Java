
public class isbn {

	public static void main(String[] args) {
		String digit[] = new String[5];
		String num = "";
		int g,cdigit;
		
		digit[0] = args[0].substring(0, 3);
		digit[1] = String.valueOf(args[0].charAt(4));
		digit[2] = args[0].substring(6, 9);
		digit[3] = args[0].substring(10, 15);
		
		for(int i=0; i<4; i++) {
			num += digit[i];
		}
		g = one(num);
		cdigit = second(g);
		
		System.out.println(digit[0] +"-"+ digit[1] +"-"+ 
		digit[2] +"-"+ digit[3] +"-"+ cdigit);
		
	}
	
	static int one(String x) {
		int a=0;
		int sum=0;
		for(int i=0; i<String.valueOf(x).length(); i++) {
			a = Integer.parseInt(x.substring(i, i+1));
			if(i % 2 == 0)
				sum += a;
			else
				sum += a*3;
		}
		return sum;
	}
	
	static int second(int y) {
		int sum=0;
		sum = y % 10;
		
		if(sum != 0)
			sum = 10 - sum;
		else
			sum = 0;
		
		return sum;
	}
}
