class kozukai{
	public static void main(String[] args){
		int i,inp,sum;
		i = 1;
		inp = 0;
		sum = 0;
		while(sum<=100000000){
			sum += inp*inp;
			inp++;
			i++;
		}
		System.out.printf("%d“ú–ÚA%d‰~",i,sum);
	}
}