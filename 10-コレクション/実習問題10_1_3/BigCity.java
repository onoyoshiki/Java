public class BigCity {
	private String code;
	private String city;
	private String pref;
	private int year;
	private int ward;
	private int pop;
	
	public BigCity(String code, String city, String pref,
			int year, int ward, int pop) {
		this.code = code;
		this.city = city;
		this.pref = pref;
		this.year = year;
		this.ward = ward;
		this.pop = pop;
	}
	
	public String getCode(){
		return code;
	}
	public String getCity(){
		return city;
	}
	public String getPref(){
		return pref;
	}
	public int getYear(){
		return year;
	}
	public int getWard(){
		return ward;
	}
	public int getPop(){
		return pop;
	}
	public String get() {
		return String.format("%s@%s@%s@%d %d %,d",
				getCode(), getCity(), getPref(), 
				getYear(), getWard(), getPop());
	}
}
