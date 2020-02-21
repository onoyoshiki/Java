import java.util.Calendar;

public class Weekday extends MyDate{
	
	public Weekday() {
		super();
	}
	
	public Weekday(int y, int m, int d) {
		super(y,m,d);
	}
	
	public char getDayOfWeek() {
		final char[] WEEK
			= {'“ú','Œ','‰Î','…','–Ø','‹à','“y'};
		int dayOfWeek;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;
		return WEEK[dayOfWeek];
	}
}
