public class TopBatter {
	private String name;	//‘Iè–¼
	private int count;		//‘ÅÈ”
	private int hit;		//ˆÀ‘Å”
	private int four;		//l€‹…”
	private int fly;		//‹]‘Å”
	private double start;	//o—Û—¦
	
	public TopBatter(String name,int count,int hit,
			int four, int fly){
		this.name = name;
		this.count = count;
		this.hit = hit;
		this.four = four;
		this.fly = fly;
		setStart();
	}
	
	public void setStart() {
		start = (getHit() + getfour()) / (getCount() - getfly());
	}
	
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getHit() {
		return hit;
	}
	
	public int getfour() {
		return four;
	}
	
	public int getfly() {
		return fly;
	}
	
	public double getStart() {
		return start;
	}
}
