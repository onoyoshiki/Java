public class City {
	private String name;
	private double temp;
	private int hum;
	private double di;
	
	public City(String name, double temp, int hum) {
		this.name = name;
		this.temp = temp;
		this.hum = hum;
		setDI();
	}
	
	private void setDI() {
		di = 0.81 * temp + 0.01 * hum *
				(0.99 * temp - 14.3) + 46.3;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTemp() {
		return temp;
	}
	
	public int getHum() {
		return hum;
	}
	
	public double getDI() {
		return di;
	}
}
