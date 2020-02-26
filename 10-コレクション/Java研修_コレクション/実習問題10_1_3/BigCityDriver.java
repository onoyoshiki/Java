import java.util.ArrayList;

public class BigCityDriver {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		BigCity[] cit = new BigCity[11]; 
		
		cit[0] = new BigCity("01100","D–ys","–kŠC“¹",1972,10,1906141);
		cit[1] = new BigCity("04100","å‘äs","‹{éŒ§",1989,5,1057659);
		cit[2] = new BigCity("11100","‚³‚¢‚½‚Üs","é‹ÊŒ§",2003,10,1233943);
		cit[3] = new BigCity("14100","‰¡•ls","_“ŞìŒ§",1956,18,3697894);
		cit[4] = new BigCity("14130","ìès","_“ŞìŒ§",1972,7,1437266);
		cit[5] = new BigCity("23100","–¼ŒÃ‰®s","ˆ¤’mŒ§",1956,16,2261377);
		cit[6] = new BigCity("26100","‹“ss","‹“s•{",1956,11,1470587);
		cit[7] = new BigCity("27100","‘åãs","‘åã•{",1956,24,2670992);
		cit[8] = new BigCity("28100","_ŒËs","•ºŒÉŒ§",1956,9,1541596);
		cit[9] = new BigCity("34100","L“‡s","L“‡Œ§",1980,8,1175275);
		cit[10] = new BigCity("40130","•Ÿ‰ªs","•Ÿ‰ªŒ§",1972,7,1483052);
		
		for(int i=0; i<cit.length; i++) {
			cityList.add(cit[i].get());
			System.out.println(cityList.get(i));
		}
	}
}