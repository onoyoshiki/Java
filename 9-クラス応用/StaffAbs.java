public class StaffAbs extends Employee{
	protected int baseSalary;
	protected int careerPoint;
	protected int earnings;
	protected final int ID_RATE = 1500;
	
	public StaffAbs(String code, String name, int baseSalary, 
			int careerPoint) {
		super(code, name);
		this.baseSalary = baseSalary;
		this.careerPoint = careerPoint;
	}
	
	public int getEarnings() {
		earnings = baseSalary + (careerPoint * ID_RATE);
		return earnings;
	}
}
