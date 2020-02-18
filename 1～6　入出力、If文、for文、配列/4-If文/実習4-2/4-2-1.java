import java.util.Scanner;

class seireki{
	public static void main(String[] args){
		int year;
		int m,t,s,h,r;
		
		m = 1868;
		t = 1912;
		s = 1926;
		h = 1989;
		r = 2019;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("西暦を元号に変換します。");
		System.out.println("1868年以降の西暦年を入力して下さい。");
		
		year = input.nextInt();
		
		if(year < t)
			System.out.printf("明治"+ (year - m) +"年です。");
		else if(year < s)
			System.out.printf("大正"+ (year - t) +"年です。");
		else if(year < h)
			System.out.printf("昭和"+ (year - s) +"年です。");
		else
			System.out.printf("平成"+ (year - h) +"年です。");
	}
}