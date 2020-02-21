public class SelectSorter extends Sorter{
	public SelectSorter(int arraySize) {
		super(arraySize);
	}
	public void lineup() {
		int min;
		System.out.println("SelectSorter is working ÅEÅEÅE");
		for(int i=0; i<randomArray.length-1; i++) {
			min = i;
			for(int j=i+1; j<randomArray.length; j++) {
				if(randomArray[min] > randomArray[j]) {
					min = j;
				}
			}
			swap(i,min);
		}
		System.out.println("Done");
	}
}
