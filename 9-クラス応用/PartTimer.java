public class PartTimer extends Staff{
	protected double workTime;
	protected int timeMoney;
	
	
	
	public PartTimer(String code,String name,
			double workTime, int timeMoney) {
		super(code,name,(int)workTime,timeMoney);
		this.workTime = workTime;
		this.timeMoney = timeMoney;
	}
	
	public int getEarnings() {
		earnings = (int)(workTime * timeMoney);
		return earnings;
	}
}
