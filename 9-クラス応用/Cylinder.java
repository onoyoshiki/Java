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
		return String.format("”¼ŒaA‚‚³%.2f ‰~’Œ‚Ì‘ÌÏ%.2f \n", radius, getVolume());
	}
}