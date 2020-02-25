public class PartTimerAbs extends Employee{
	protected double workTime;
	protected int timeMoney;
	
	public PartTimerAbs(String code,String name,
			double workTime, int timeMoney) {
		super(code,name);
		this.workTime = workTime;
		this.timeMoney = timeMoney;
	}
	
	public int getEarnings() {
		int earnings;
		earnings = (int)(workTime * timeMoney);
		return earnings;
	}
}
