import java.util.Scanner;

public class MyCircleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("円の半径を入力してください:");
		
		MyCircle rad = new MyCircle(input.nextInt());
		
		System.out.printf("円周:%.2f、面積:%.2f",rad.getCircum(),rad.getArea());
	}

}
