public class SorterTest {

	public static void main(String[] args) {
		int arraySize = 50000;
		
		Timer timer = new Timer();
		
		Sorter[] sorter = {
				new BubbleSorter(arraySize),
				new SelectSorter(arraySize)
		};
		
		for(int i=0; i<sorter.length; i++) {
			sorter[i].setRandom();
			
			timer.start();
			sorter[i].lineup();
			timer.stop();
			
			System.out.printf("Š—vŽžŠÔ:%4.2f •b \n",timer.getTime());
			
			sorter[i].showArray();
		}
	}

}
