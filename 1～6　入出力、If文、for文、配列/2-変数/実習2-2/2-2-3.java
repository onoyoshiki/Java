class moon{
	public static void main(String[] args){
		int speed;	//�b��
		double dload;	//double�^����
		int hour;	//����
		int time;	//��
		int iload;	//int�^����
		
		speed = 8 * 3600;
		dload = 3.85E5;
		iload = (int)dload;
		
		time = (iload / speed)/60;
		hour = (iload / speed);
		
		System.out.println("���ւ̔�s���Ԃ́A" + time + "����" + hour + "���ł��B");
	}
}