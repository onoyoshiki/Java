public abstract class Employee {
	protected String code;
	protected String name;
	
	public Employee(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public abstract int getEarnings();
}
