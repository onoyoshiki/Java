class moon{
	public static void main(String[] args){
		int speed;	//•b‘¬
		double dload;	//doubleŒ^‹——£
		int hour;	//ŠÔ
		int time;	//•ª
		int iload;	//intŒ^‹——£
		
		speed = 8 * 3600;
		dload = 3.85E5;
		iload = (int)dload;
		
		time = (iload / speed)/60;
		hour = (iload / speed);
		
		System.out.println("Œ‚Ö‚Ì”òsŠÔ‚ÍA" + time + "ŠÔ" + hour + "•ª‚Å‚·B");
	}
}