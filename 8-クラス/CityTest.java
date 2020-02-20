public class CityTest {
	public static void main(String[] args) {
		City[] ct = new City[10];
		
		ct[0] = new City("シンガポール",29.0, 84);
		ct[1] = new City("マイアミ　　　",30.2, 72);
		ct[2] = new City("テヘラン　　　",31.0, 36);
		ct[3] = new City("カイロ　　　　",28.0, 53);
		ct[4] = new City("ローマ　　　　",25.6, 78);
		ct[5] = new City("香港　　　　",29.8, 77);
		ct[6] = new City("ロンドン　　　",21.5, 84);
		ct[7] = new City("モスクワ　　　",18.2, 74);
		ct[8] = new City("シカゴ　　　　",24.6, 68);
		ct[9] = new City("ニューヨーク　",26.5, 64);
		
		double maxDI = 0.0;
		double minDI = 100.0;
		String maxCityName = "";
		String minCityName = "";
		
		System.out.println("　都市名　　　気温　湿度　不快指数");
		
		for (int i=0; i<ct.length; i++) {
			if(maxDI < ct[i].getDI()) {
				maxDI = ct[i].getDI();
				maxCityName = ct[i].getName();
			}
			
			if(minDI > ct[i].getDI()) {
				minDI = ct[i].getDI();
				minCityName = ct[i].getName();
			}
			
			System.out.printf("%s  %2.1f    %d%%  %2.2f\n",
					ct[i].getName(), ct[i].getTemp(), ct[i].getHum(),
					ct[i].getDI());
		}
		System.out.println();
		System.out.printf(
				"7月の不快指数が最大の都市は%sで、不快指数は%2.2fです\n",
				maxCityName.trim(), maxDI);
		System.out.printf(
				"7月の不快指数が最小の都市は%sで、不快指数は%2.2fです\n",
				minCityName.trim(), minDI);
	}
}
