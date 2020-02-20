public class MyTriangle {
	private MyLine ln1;
	private MyLine ln2;
	private MyLine ln3;
	public MyTriangle(MyLine ln1, MyLine ln2, MyLine ln3) {
		this.ln1 = ln1;
		this.ln2 = ln2;
		this.ln3 = ln3;
	}
	
	public void getArea() {
		double s,area;
		double a,b,c;
		
		a = ln1.getLen();
		b = ln2.getLen();
		c = ln3.getLen();
		
		s = (a + b + c) / 2;
		area = Math.sqrt((s-a)*(s-b)*(s-c));
		
		System.out.printf("ñ êœÇÕ%.2f",area);
	}
}
