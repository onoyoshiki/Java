import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ocean {
	
	public static void main(String[] args) {
		int[] num = new int[1831];
		int[] hoketu = new int[30];
		
		for(int i=0; i<num.length; i++)
			num[i]+=i+1;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<num.length; i++) 
			list.add(num[i]);
		
		Collections.shuffle(list);
		
		System.out.println("“–‘IŽÒ");
		for(int i=0; i<277; i++)
			System.out.printf("%d \n",list.get(i));
		
		for(int i=0; i<hoketu.length; i++)
			hoketu[i]=list.get(i+277);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0; i<hoketu.length; i++) 
			list2.add(hoketu[i]);
		
		Collections.shuffle(list2);
		
		System.out.println("•âŒ‡“–‘IŽÒ");
		for(int i=0; i<hoketu.length; i++)
			System.out.printf("%d\n",list2.get(i));
	}
}