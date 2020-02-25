public class ManagerAbs extends StaffAbs{	
	protected int sectionPoint;
	
	public ManagerAbs(String code,String name,
			int baseSalary, int careerPoint, int sectionPoint) {
		super(code, name, baseSalary, careerPoint);
		this.sectionPoint = sectionPoint;
	}
	
	public int getEarnings() {
		final int sectionmoney = 2250;
		earnings = baseSalary + (careerPoint * ID_RATE);
		earnings += sectionPoint * sectionmoney;
		return earnings;
	}
}

