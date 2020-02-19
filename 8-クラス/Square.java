
public class Square {
	char ch;
	int width;
	public Square(char a, int b) {
		ch = a;
		width = b;
	}
	
	public void display() {
		for(int i=1; i<=width; i++) {
			for(int j=1; j<=width; j++)
				System.out.print(ch);
			System.out.println();
		}
	}
}
