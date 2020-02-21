public class Staff {
	protected String code;
	protected String name;
	protected int baseSalary;
	protected int careerPoint;
	protected int earnings;
	protected final int ID_RATE = 1500;
	
	public Staff(String code, String name,
			int baseSalary, int careerPoint) {
		this.code = code;
		this.name = name;
		this.baseSalary = baseSalary;
		this.careerPoint = careerPoint;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	public int getCareerPoint() {
		return careerPoint;
	}
	
	public int getEarnings() {
		earnings = baseSalary + (careerPoint * ID_RATE);
		return earnings;
	}
}
