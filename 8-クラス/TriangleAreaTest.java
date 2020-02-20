
public class TriangleAreaTest {

	public static void main(String[] args) {
		MyPoint[] point = new MyPoint[3];
		MyLine[] line = new MyLine[3];
		
		point[0] = new MyPoint(0,0);
		point[1] = new MyPoint(3,2);
		point[2] = new MyPoint(1,4);
		
		line[0] = new MyLine(point[0],point[1]);
		line[1] = new MyLine(point[1],point[2]);
		line[2] = new MyLine(point[2],point[0]);
		
		MyTriangle tri = new MyTriangle(line[0],line[1],line[2]);
		tri.getArea();
	}

}
