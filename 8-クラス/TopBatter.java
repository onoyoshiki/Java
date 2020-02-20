public class TopBatter {
	private String name;	//�I�薼
	private int count;		//�ŐȐ�
	private int hit;		//���Ő�
	private int four;		//�l������
	private int fly;		//�]�Ő�
	private double start;	//�o�ۗ�
	
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
