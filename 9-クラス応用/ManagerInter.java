public class ManagerInter extends StaffInter{	
	private int sectionPoint;
	private int earnings;
	private String jobType = "ä«óùêE";
	
	public ManagerInter(String code,String name,
			int baseSalary, int careerPoint, int sectionPoint) {
		super(code, name, baseSalary, careerPoint);
		this.sectionPoint = sectionPoint;
	}
	
	public int getSectionPoint() {
		return sectionPoint;
	}
	
	public String getJobType() {
		return jobType;
	}
	
	public int getEarnings() {
		final int sectionmoney = 2250;
		earnings = baseSalary + (careerPoint * ID_RATE);
		earnings += getSectionPoint() * sectionmoney;
		return earnings;
	}
}

