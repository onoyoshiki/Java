public class StaffInter extends Payment {
	protected int careerPoint;
	protected int baseSalary;
	protected int earnings;
	private String jobType = "ˆê”ÊŽÐˆõ";
	
	public StaffInter(String code, String name,
			int baseSalary, int careerPoint) {
		this.code = code;
		this.name = name;
		this.baseSalary = baseSalary;
		this.careerPoint = careerPoint;
	}
	
	public int getCareerPoint() {
		return careerPoint;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public String getJobType() {
		return jobType;
	}
	public int getEarnings() {
		earnings = baseSalary + (careerPoint * ID_RATE);
		return earnings;
	}
}