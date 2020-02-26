import java.util.ArrayList;
import java.util.Scanner;

public class PointTest{
	public static void main(String[] args) {
		int i=0;
		int point=0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Point res = new Point();
		ArrayList<Integer> pointList = new ArrayList<Integer>();
		
		System.out.println("得点(終了するには0以下を入力)");
		while(point >= 0) {
			System.out.printf("番号%d:",i+1);
			point = scan.nextInt();
			pointList.add(point);
			i++;
		}
		
		System.out.printf("最高点:%d\n",res.getMaxPoint(pointList));
		System.out.printf("最低点:%d\n",res.getMinPoint(pointList));
		System.out.printf("平均点:%.2f",res.getAveragePoint(pointList));
	}
}