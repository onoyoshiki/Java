class chinchiro{
	public static void main(String[] args){
		int dice1,dice2;	//�T�C�R���̖�
		int sum;				//�ڂ̍��v
		
		System.out.println("2�̃T�C�R����U��܂�");
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("�T�C�R��1:" + dice1);
		System.out.println("�T�C�R��2:" + dice2);
		
		sum = dice1 + dice2;
		
		System.out.println("���v:" + sum);
		
		if(sum % 2 == 0)
			System.out.printf("��!");
		else
			System.out.printf("��!");
	}
}