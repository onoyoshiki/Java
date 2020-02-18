class ast{
	public static void main(String[] args){
		for(int i=1; i <= 10; i++){
			for(int j=1; j <= i; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(int i=0; i <= 9; i++){
			for(int j=0; j <= 9-i; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(int i=0; i <= 9; i++){
			for(int j=i; j <= 9; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(int i=0; i <= 9; i++){
			for(int j=9-i; j <= 9; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
	}
}