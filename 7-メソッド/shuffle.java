import java.util.Random;
public class shuffle {
	static int num[] = new int[10];
	static int o;
	
	public static void main(String[] args) {
		int ran = 0;
		Random rnd = new Random();
		for(int i=0; i<10; i++) {
			num[i] = i;
			System.out.printf("%2d",num[i]);
		}
		System.out.printf("\n");
		
		for(int i=0; i<10; i++) {
			ran = rnd.nextInt(9) + 1;
			System.out.printf("“YŽš%d‚Æ%d‚ÌŒðŠ· ",i,ran);
			mix(num[i],ran);
			for(int j=0; j<10; j++) {
				System.out.printf("%2d",num[j]);
			}
			System.out.printf("\n");
		}
		
		for(int k=0; k<10; k++) {
			System.out.printf("%2d",num[k]);
		}
	}
	static void mix(int x,int y) {
		o = num[x];
		num[x] = num[y];
		num[y] = o;
	}
}
