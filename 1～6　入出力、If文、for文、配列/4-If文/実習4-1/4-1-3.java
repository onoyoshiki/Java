import java.util.Scanner;

class chinchiro2{
	public static void main(String[] args){
		int num;			//�K���Ȑ��l
		int dice1,dice2;	//�T�C�R���̖�
		int sum;				//�ڂ̍��v
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�D���Ȑ�����͂��ĉ�����");
		
		num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.printf("���͒l�́A��!\n\n");
		else
			System.out.printf("���͒l�́A��!\n\n");
		
		System.out.println("2�̃T�C�R����U��܂�");
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("�T�C�R��1:" + dice1);
		System.out.println("�T�C�R��2:" + dice2);
		
		sum = dice1 + dice2;
		
		System.out.println("���v:" + sum);
		
		if(sum % 2 == 0)
			System.out.printf("�o�ڂ́A��!\n\n");
		else
			System.out.printf("�o�ڂ́A��!\n\n");
		
		if((num % 2 == 0 && sum % 2 == 0) || (num % 2 != 0 && sum % 2 != 0))
			System.out.printf("���Ȃ��̏���!");
		else
			System.out.printf("���Ȃ��̕���!");
	}
}