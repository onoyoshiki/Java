import java.util.Scanner;

public class SolidTest {
	public static void main(String[] args) {
		double radius;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("”¼Œa");
		radius = scan.nextDouble();
		System.out.println();
		
		Solid[] solid = {
				new Sphere(radius),
				new Cone(radius),
				new Cylinder(radius)
		};
		for(int i=0; i<solid.length; i++)
			System.out.println(solid[i]);
	}
}