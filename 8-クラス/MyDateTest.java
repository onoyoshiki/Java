import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		int myYear;
		int myMonth;
		int myDay;
		int myDay2;
		final long MIL_PER_DAY = 24*60*60*1000;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n 西暦:");
		myYear = scan.nextInt();
		System.out.print("\n 月:");
		myMonth = scan.nextInt();
		System.out.print("\n 日:");
		myDay = scan.nextInt();
		//System.out.print("\n 日2:");
		//myDay2 = scan.nextInt();
		
		MyDate today = new MyDate();
		MyDate birth = new MyDate(myYear, myMonth, myDay);
		
		if(birth.getYear() == 0) {
			System.out.println("範囲外");
			System.exit(1);
		}
		if(birth.getMonth() == 0) {
			System.out.println("範囲外");
			System.exit(1);
		}
		if(birth.getDay() == 0) {
			System.out.println("範囲外");
			System.exit(1);
		}
		
		System.out.println();
		System.out.printf("誕生日:%d年%d月%d日",birth.getYear(),birth.getMonth(),birth.getDay());
		System.out.printf("\n今日:%d年%d月%d日",today.getYear(),today.getMonth(),today.getDay());
		System.out.printf("\n\n経過:%d日",(int)((today.getMillis()-birth.getMillis()) / MIL_PER_DAY + 1));
	}

}
