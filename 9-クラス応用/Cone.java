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
		return String.format("”¼ŒaA‚‚³%.2f ‰~‚Ì‘ÌÏ%.2f \n", radius, getVolume());
	}
}