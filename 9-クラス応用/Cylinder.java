import static java.lang.Math.*;

public class Cylinder implements Solid{
	private double radius;
	public Cylinder(double radius) {
		this.radius = radius;
	}
	public double getVolume() {
		return PAI * pow(radius, 3) * 2;
	}
	public String toString() {
		return String.format("���a�A����%.2f �~���̑̐�%.2f \n", radius, getVolume());
	}
}