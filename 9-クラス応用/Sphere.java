import static java.lang.Math.*;

public class Sphere implements Solid{
	private double radius;
	public Sphere(double radius) {
		this.radius = radius;
	}
	public double getVolume() {
		return PAI * pow(radius, 3) * 4 / 3;
	}
	public String toString() {
		return String.format("���a%.2f ���̑̐�%.2f \n", radius, getVolume());
	}	
}