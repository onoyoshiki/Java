import java.util.Random;
public abstract class Sorter {
	protected int[] randomArray;
	protected int arraySize;
	protected final long SEED = 12345L;
	
	public Sorter(int arraySize) {
		this.arraySize = arraySize;
		randomArray = new int[arraySize];
	}
	
	protected void setRandom() {
		Random rnd = new Random(SEED);
		for(int i=0; i<randomArray.length; i++)
			randomArray[i] = rnd.nextInt(randomArray.length);
	}
	
	protected void showArray() {
		int counter = 0;
		for(int i=0; i<randomArray.length; i++) {
			counter++;
			System.out.printf((counter % 8) == 0? "%7d\n" : "%7d", randomArray[i]);
		}
		System.out.println();
	}
	
	protected void swap(int right, int left) {
		int temp = randomArray[right];
		randomArray[right] = randomArray[left];
		randomArray[left] = temp;
	}
	
	public abstract void lineup();
}
