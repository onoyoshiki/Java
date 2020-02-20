
public class TriangleArea {
	public static void main(String[] args) {
		int[][] pt = {{0,0},{3,2},{1,4}};
		double[] lineLen = new double[3];
		double area;
		
		lineLen[0] = getLen(pt[0][0], pt[0][1], pt[1][0], pt[1][1]);
		lineLen[1] = getLen(pt[1][0], pt[1][1], pt[2][0], pt[2][1]);
		lineLen[2] = getLen(pt[2][0], pt[2][1], pt[0][0], pt[0][1]);
		
		area = getArea(lineLen[0], lineLen[1], lineLen[2]);
		System.out.printf("ñ êœ%.2f", area);
		
	}
	
	public static double getLen(int x1, int y1, int x2, int y2) {
		int dx, dy;
		double len;
		
		dx = x1 - x2;
		dy = y1 - y2;
		len = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		
		return len;
	}
	
	public static double getArea(double p, double q, double r) {
		double s, area;
		
		s = (p+q+r)/2;
		area = Math.sqrt((s-p)*(s-q)*(s-r));
		
		return area;
	}
}
