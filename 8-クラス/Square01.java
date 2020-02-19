
public class Square01 {
	String str;
	int width;
	public Square01(String a, int b) {
		str = a;
		width = b;
	}
	
	public void display() {
		for(int i=1; i<=width; i++) {
			for(int j=1; j<=width; j++)
				System.out.print(str);
			System.out.println();
		}
	}
}
