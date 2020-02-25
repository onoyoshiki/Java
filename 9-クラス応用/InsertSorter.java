public class InsertSorter extends Sorter{
	public InsertSorter(int arraySize) {
		super(arraySize);
	}
	public void lineup() {
		int i, j, temp;
		System.out.println("InsertSorter is working ÅEÅEÅE");
		for(i=1; i<randomArray.length; i++) {
			temp = randomArray[i];
			j = i;
			while(j>0 && randomArray[j-1]>=temp) {
				randomArray[j] = randomArray[j-1];
				j--;
			}
			randomArray[j] = temp;
		}
		System.out.println("Done!");
	}
}
