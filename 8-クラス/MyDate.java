import java.util.Calendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private long timeInMillis;
	Calendar cal;
	
	public MyDate() {
		cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DATE);
		setMillis();
	}
	
	public MyDate(int y, int m, int d) {
		setYear(y);
		setMonth(m);
		setDay(d);
		setMillis();
	}
	
	private void setYear(int tempYear) {
		if(tempYear>=1 && tempYear<=3000)
			year = tempYear;
		else
			year = 0;
	}
	
	private void setMonth(int tempMonth) {
		if(tempMonth>0 && tempMonth<=12)
			month = tempMonth;
		else
			month = 0;
	}
	
	private void setDay(int tempDay) {
		int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(tempDay>0 && tempDay<=daysPerMonth[month])
			day = tempDay;
		else if(tempDay==29 && month==2 &&
				(year%400==0 || year%4==0 && year%100!=0))
			day = tempDay;
		else
			day = 0;
	}
	
	private void setMillis() {
		cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		timeInMillis = cal.getTimeInMillis();
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public long getMillis() {
		return timeInMillis;
	}
}
