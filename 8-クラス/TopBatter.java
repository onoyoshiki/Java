public class TopBatter {
	private String name;	//選手名
	private int count;		//打席数
	private int hit;		//安打数
	private int four;		//四死球数
	private int fly;		//犠打数
	private double start;	//出塁率
	
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
