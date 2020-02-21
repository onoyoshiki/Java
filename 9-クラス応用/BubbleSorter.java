public class BubbleSorter extends Sorter{
	public  BubbleSorter(int arraySize) {
		super(arraySize);
	}
	public void lineup() {
		System.out.println("BubbleSorter is working ÅEÅEÅE");
		for(int i=1; i<randomArray.length; i++) {
			boolean isSwap = false;
			for(int j=0; j<randomArray.length-i; j++) {
				if(randomArray[j] > randomArray[j+1]) {
					swap(j, j+1);
					isSwap = true;
				}
			}
			if(!isSwap)
				break;
		}
		System.out.println("Done");
	}
}
