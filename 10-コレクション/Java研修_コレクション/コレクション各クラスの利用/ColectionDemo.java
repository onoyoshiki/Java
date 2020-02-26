import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ColectionDemo {
	public static void main(String[] args) {
		
		Collection<String> arrayList =
				new ArrayList<String>();
		showElements(arrayList);
		
		Collection<String> LinkedList =
				new LinkedList<String>();
		showElements(LinkedList);
		
		Collection<String> HashSet =
				new HashSet<String>();
		showElements(HashSet);
		
		Collection<String> LinkedHashSet =
				new LinkedHashSet<String>();
		showElements(LinkedHashSet);
		
		Collection<String> TreeSet =
				new TreeSet<String>();
		showElements(TreeSet);
	}
	
	static void showElements(Collection<String> col) {
		String[] flavorA = 
			{"mint", "mocha", "charamel", "vanilla", "ramRaisin"};
		String[] flavorB =
			{"strawberry", "vanilla", "lemon", "mocha" };
		
		for(int i=0; i<flavorA.length; i++) {
			col.add(flavorA[i]);
		}
		System.out.println(col.getClass().getName());
		System.out.printf("FlavorA :%s\n", col);
		
		for(int i=0; i<flavorB.length; i++) {
			col.add(flavorB[i]);
		}
		System.out.printf("FlavorA+B :%s\n", col);
		
		System.out.printf("—v‘f‚Ì”:%s\n", col.size());
		System.out.println();
	}
}