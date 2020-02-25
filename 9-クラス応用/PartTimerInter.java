public class PartTimerInter extends Payment{
	private double hour;
	private int wagePerHour;
	private int earnings;
	private String jobType = "パートタイマー";
	
	public PartTimerInter(String code,String name,
			double hour, int wagePerHour) {
		this.code = code;
		this.name = name;
		this.hour = hour;
		this.wagePerHour = wagePerHour;
	}
	
	public double getHour() {
		return hour;
	}
	
	public int getWagePerHour() {
		return wagePerHour;
	}
	
	public String getJobType() {
		return jobType;
	}
	
	public int getEarnings() {
		earnings = (int)(hour * wagePerHour);
		return earnings;
	}
}
