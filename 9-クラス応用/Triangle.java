public class Triangle implements Figure{
	double la;
	double lb;
	double lc;
	public Triangle(double la, double lb, double lc) {
		this.la = la;
		this.lb = lb;
		this.lc = lc;
	}
	public String toString() {
		return "Triangle : sides = " + la + ", " + lb + ", " + lc + " : ";
	}
	public double getArea() {
		double s = (la + lb + lc) / 2.0;
		return Math.sqrt(s*(s-la)*(s-lb)*(s-lc));
	}
}