class moon{
	public static void main(String[] args){
		int speed;	//b¬
		double dload;	//double^£
		int hour;	//Τ
		int time;	//ͺ
		int iload;	//int^£
		
		speed = 8 * 3600;
		dload = 3.85E5;
		iload = (int)dload;
		
		time = (iload / speed)/60;
		hour = (iload / speed);
		
		System.out.println("ΦΜςsΤΝA" + time + "Τ" + hour + "ͺΕ·B");
	}
}