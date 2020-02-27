import java.util.ArrayList;

public class Point {
	public int getMaxPoint(ArrayList<Integer> x) {
		int max=0;
		for(int i=0; i<x.size(); i++) {
			if(max < x.get(i))
				max = x.get(i);
		}
		return max;
	}
	
	public int getMinPoint(ArrayList<Integer> x) {
		int min=100;
		for(int i=0; i<x.size()-1; i++) {
			if(min > x.get(i))
				min = x.get(i);
		}
		return min;
	}
	
	public double getAveragePoint(ArrayList<Integer> x) {
		double ave = 0;
		int num = x.size()-1;
		for(int i=0; i<num; i++) {
			ave += (double)x.get(i); 
		}
		return ave/num;
	}
}