
public class RightToLeft {

	public static void main(String[] args) {
		String wor="";
		
		StringBuilder rev = new StringBuilder();
		for(int i=0; i<args.length; i++) {
			wor = args[i];
			rev = rev.append(wor).reverse();
			System.out.printf("%s", rev);
		}
	}
}
