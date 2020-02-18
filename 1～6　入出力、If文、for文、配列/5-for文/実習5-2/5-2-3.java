class menseki{
	public static void main(String[] args){
		int inp;	//“ü—Í”N
		inp =100;
		for(int a=1; a <= inp; a++){
			
			for(int b=1; b <= inp; b++){
				
				for(int c=1; c <= inp; c++){
					if ((a*a == b*b + c*c) && b >= c)
						System.out.printf("%d:%d:%d\n",a,b,c);
						
				}
			}
		}
	}
}