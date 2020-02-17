class kounen{
	public static void main(String[] args){
		long speed;	//光の速度毎秒
		long load;		//距離
		int year;		//1年
		double res;		//結果
		
		speed = 299792458;
		year = 365;
		
		//1日の光の速度
		load = speed * 3600 * 24;
		
		//1年の光の速度
		load *= year;
		
		res = load;
		
		System.out.println("1光年は" + res + "kmです。");
	}
}