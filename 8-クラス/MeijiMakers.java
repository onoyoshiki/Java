public class MeijiMakers {
	private String name;
	private int birth;
	private int heaven;
	private int life; 
	private String cause;
	
	public MeijiMakers(String name, int birth,
			int heaven, String cause) {
		this.name = name;
		this.birth = birth;
		this.heaven = heaven;
		setLifeTime();
		this.cause = cause;
	}
	
	public void setLifeTime() {
		life = getHeaven() - getBirthYear() + 1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birth;
	}
	
	public int getHeaven() {
		return heaven;
	}
	
	public int getLifeTime() {
		return life;
	}
	
	public String getCause() {
		return cause;
	}
}
