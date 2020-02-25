public class AreaTest {
	public static void main(String[] args) {
		Figure[] figures = {
				new Triangle(2, 3, 3),
				new Rectangle(5, 8),
				new Square(5)};
		for(int i=0; i<figures.length; i++) {
			System.out.println(figures[i] +
					"area = " + figures[i].getArea());
		}
	}
}