import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		int myYear;
		int myMonth;
		int myDay;
		//int myDay2;
		final long MIL_PER_DAY = 24*60*60*1000;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n 西暦:");
		myYear = scan.nextInt();
		System.out.print("\n 月:");
		myMonth = scan.nextInt();
		System.out.print("\n 日:");
		myDay = scan.nextInt();
		//System.out.print("\n 日2:");
		//myDay2 = scan.nextInt();
		
		Weekday today = new Weekday();
		Weekday birth = new Weekday(myYear, myMonth, myDay);
		
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
		System.out.printf("誕生日:%d年%d月%d日%s曜日",birth.getYear(),birth.getMonth(),birth.getDay(),birth.getDayOfWeek());
		System.out.printf("\n今日:%d年%d月%d日%s曜日",today.getYear(),today.getMonth(),today.getDay(),today.getDayOfWeek());
		System.out.printf("\n\n経過:%d日",(int)((today.getMillis()-birth.getMillis()) / MIL_PER_DAY + 1));
	}

}
