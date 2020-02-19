
public class MyCircle {
	private int radius;
	
	public MyCircle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public double getCircum() {
		return 2*Math.PI*radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
