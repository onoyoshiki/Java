class genri{
	public static void main(String[] args){
		double sum;
		
		System.out.println("年　原理合計");
		
		for(int i=1; i <= 15; i++){
			sum = 1200000 * Math.pow(2.85,i);
			System.out.println(i + " " + sum);
		}
		
	}
}