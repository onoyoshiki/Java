import java.util.Scanner;

public class MyCircleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�~�̔��a����͂��Ă�������:");
		
		MyCircle rad = new MyCircle(input.nextInt());
		
		System.out.printf("�~��:%.2f�A�ʐ�:%.2f",rad.getCircum(),rad.getArea());
	}

}
