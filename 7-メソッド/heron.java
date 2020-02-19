
public class heron {
	
	public static void main(String[] args) {
		double array[] = new double[args.length];
		
		for(int i=0; i<args.length; i++) {
			array[i] = Double.parseDouble(args[i]);
		}
		if(!(isTriangle(array[0],array[1],array[2])))
			System.out.println("a,b,c‚ÍŽOŠpŒ`‚Ì3•Ó‚ð\¬‚µ‚Ü‚¹‚ñ");
		else	
			System.out.printf("%f", area(array[0],array[1],array[2]));
	}
	
	static double area(double a,double b,double c) {
		double s,ar;
		s = (a+b+c)/2;
		ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ar;
	}
	
	static boolean isTriangle(double d,double e,double f) {
		if(d < e + f)
			if(e < d + f)
				if(f < d + e)
					return true;
				else
					return false;
			else
				return false;
		else
			return false;
	}
}
