class rate{
	public static void main(String[] args){
		int genbu;	//����
		int byakko;	//����
		int suzaku;	//�鐝
		int seiryu;	//��
		int en;		//���{�~
		double pond;	//�p�|���h
		
		genbu = 99720 * 3;
		byakko = 110270 * 5;
		suzaku = 124980 * 5;
		seiryu = 141730 * 2;
		
		en = genbu + byakko + suzaku + seiryu;
		pond = (double)en * 127.882872;
		
		System.out.println("�������z");
		System.out.println("���{�~�@:" + en + "�~");
		System.out.println("�p�|���h:" + pond + "�|���h");
	}
}