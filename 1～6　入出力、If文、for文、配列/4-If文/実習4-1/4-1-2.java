class chinchiro{
	public static void main(String[] args){
		int dice1,dice2;	//サイコロの目
		int sum;				//目の合計
		
		System.out.println("2つのサイコロを振ります");
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("サイコロ1:" + dice1);
		System.out.println("サイコロ2:" + dice2);
		
		sum = dice1 + dice2;
		
		System.out.println("合計:" + sum);
		
		if(sum % 2 == 0)
			System.out.printf("丁!");
		else
			System.out.printf("半!");
	}
}