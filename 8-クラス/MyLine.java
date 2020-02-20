public class MyLine {
	private MyPoint p1;
	private MyPoint p2;
	
	public MyLine(MyPoint p1, MyPoint p2) {
		this.p1 = new MyPoint(p1.getX(),p2.getX());
		this.p2 = new MyPoint(p1.getY(),p2.getY());
	}
	
	public double getLen() {
		int dx,dy;
		double len;
		
		dx = (p1.getX() - p1.getY());
		dy = (p2.getX() - p2.getY());
		
		len = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		
		return len;
	}
}
