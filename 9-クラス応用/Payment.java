public abstract class Payment {
	protected String code;
	protected String name;
	protected int ID_RATE = 1500;
	protected int SECTION_RATE;
	
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return String.format("%sÅ@%sÅ@%sÅ@%,dâ~\n",
				getCode(), getName(), 
				getJobType(), getEarnings());
	}
	
	public abstract String getJobType();
	
	public abstract int getEarnings();
}