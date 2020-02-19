import java.util.Scanner;

public class MyCircleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("‰~‚Ì”¼Œa‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		
		MyCircle rad = new MyCircle(input.nextInt());
		
		System.out.printf("‰~ü:%.2fA–ÊÏ:%.2f",rad.getCircum(),rad.getArea());
	}

}
