class kounen{
	public static void main(String[] args){
		long speed;	//���̑��x���b
		long load;		//����
		int year;		//1�N
		double res;		//����
		
		speed = 299792458;
		year = 365;
		
		//1���̌��̑��x
		load = speed * 3600 * 24;
		
		//1�N�̌��̑��x
		load *= year;
		
		res = load;
		
		System.out.println("1���N��" + res + "km�ł��B");
	}
}