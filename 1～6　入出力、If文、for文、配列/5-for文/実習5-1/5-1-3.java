class sinzoku{
	public static void main(String[] args){
		int sum,res;
		
		res = 0;
		for(int i=1; i <= 10; i++){
			sum = (int)Math.pow(2,i);
			res += sum;
			System.out.println(i +"世代前までのあなたの直系親族は"+res+"です。");
		}
		
	}
}