public class Rectangle implements Figure{
	double height;
	double width;
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public String toString() {
		return "Rectangle : height = " + height + ", width = " + width + " : ";
	}
	public double getArea() {
		return height * width;
	}
}