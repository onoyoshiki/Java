public class TopBatterTest {

	public static void main(String[] args) {
		
		TopBatter[] tt = new TopBatter[12];
		
		tt[0] = new TopBatter("長野",676,171,50,10);
		tt[1] = new TopBatter("坂　",668,214,43,0);
		tt[2] = new TopBatter("大島",625,170,40,5);
		tt[3] = new TopBatter("山田",667,209,81,0);
		tt[4] = new TopBatter("堂林",659,172,57,36);
		tt[5] = new TopBatter("石川",584,153,24,38);
		tt[6] = new TopBatter("陽　",662,193,74,7);
		tt[7] = new TopBatter("聖沢",577,150,62,24);
		tt[8] = new TopBatter("中村",662,167,50,10);
		tt[9] = new TopBatter("金子",643,170,48,14);
		tt[10] = new TopBatter("荻野",692,206,83,8);
		tt[11] = new TopBatter("坂口",622,172,56,7);
		
		for(int i=0; i<tt.length; i++)
			System.out.printf("%s　　%d　　%d　 %.3f\n", tt[i].getName(), tt[i].getCount(),
					tt[i].getHit(), tt[i].getStart());
	}
}
