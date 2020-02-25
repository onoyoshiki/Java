import static java.lang.Math.*;

public class Cone implements Solid{
	private double radius;
	public Cone(double radius) {
		this.radius = radius;
	}
	public double getVolume() {
		return PAI * pow(radius, 3) * 2 / 3;
	}
	public String toString() {
		return String.format("���a�A����%.2f �~���̑̐�%.2f \n", radius, getVolume());
	}
}