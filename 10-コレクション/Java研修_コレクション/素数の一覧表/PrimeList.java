import java.util.ArrayList;

public class PrimeList {
	public ArrayList<Integer> listUp(int num){
		
		int max = num;
		boolean[] isPrime = new boolean[max];
		
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		for(int i=2; i<max; i++) {
			isPrime[i] = true;
		}
		for(int i=2; i*i<max; i++) {
			if(isPrime[i])
				for(int j=i; i*j<max; j++)
					isPrime[i*j] = false;
		}
		
		for(int i=1; i<max; i++) {
			if(isPrime[i])
				primeList.add(i);
		}
		
		return primeList;
	}
}