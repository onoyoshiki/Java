import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		int myYear;
		int myMonth;
		int myDay;
		int myDay2;
		final long MIL_PER_DAY = 24*60*60*1000;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n ����:");
		myYear = scan.nextInt();
		System.out.print("\n ��:");
		myMonth = scan.nextInt();
		System.out.print("\n ��:");
		myDay = scan.nextInt();
		//System.out.print("\n ��2:");
		//myDay2 = scan.nextInt();
		
		MyDate today = new MyDate();
		MyDate birth = new MyDate(myYear, myMonth, myDay);
		
		if(birth.getYear() == 0) {
			System.out.println("�͈͊O");
			System.exit(1);
		}
		if(birth.getMonth() == 0) {
			System.out.println("�͈͊O");
			System.exit(1);
		}
		if(birth.getDay() == 0) {
			System.out.println("�͈͊O");
			System.exit(1);
		}
		
		System.out.println();
		System.out.printf("�a����:%d�N%d��%d��",birth.getYear(),birth.getMonth(),birth.getDay());
		System.out.printf("\n����:%d�N%d��%d��",today.getYear(),today.getMonth(),today.getDay());
		System.out.printf("\n\n�o��:%d��",(int)((today.getMillis()-birth.getMillis()) / MIL_PER_DAY + 1));
	}

}
