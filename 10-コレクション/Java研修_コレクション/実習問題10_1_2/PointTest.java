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
		
		System.out.println("���_(�I������ɂ�0�ȉ������)");
		while(point >= 0) {
			System.out.printf("�ԍ�%d:",i+1);
			point = scan.nextInt();
			pointList.add(point);
			i++;
		}
		
		System.out.printf("�ō��_:%d\n",res.getMaxPoint(pointList));
		System.out.printf("�Œ�_:%d\n",res.getMinPoint(pointList));
		System.out.printf("���ϓ_:%.2f",res.getAveragePoint(pointList));
	}
}