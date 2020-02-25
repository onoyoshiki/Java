package ‘f”‚Ìˆê——•\;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeListTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ãŒÀ");
		int upper = scan.nextInt();
		System.out.println();
		
		PrimeList pl = new PrimeList();
		ArrayList<Integer> primes = pl.listUp(upper);
		
		int counter = 0;
		for(int dt : primes)
			System.out.printf(++counter%10 == 0 ? "%7d\n" : "%7d",dt);
		
		System.out.printf("\n%dˆÈ‰º%dŒÂ", upper, primes.size());
	}
}