public class ScopeTest {
	static int x = 20;
	static void printLocal(){
		int x = 10;
		System.out.printf("%4d", x);
		x *= 3;
		System.out.printf("%4d", x);
	}
	
	static void printField(){
		System.out.printf("%4d", x);
		x++;
		System.out.printf("%4d", x);
	}
	
	public static void main(String[] args){
		int x = 50;
		
		printLocal();
		printField();
		System.out.printf("%4d", x);
		printLocal();
		printField();
	}
}
