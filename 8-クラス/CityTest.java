public class CityTest {
	public static void main(String[] args) {
		City[] ct = new City[10];
		
		ct[0] = new City("�V���K�|�[��",29.0, 84);
		ct[1] = new City("�}�C�A�~�@�@�@",30.2, 72);
		ct[2] = new City("�e�w�����@�@�@",31.0, 36);
		ct[3] = new City("�J�C���@�@�@�@",28.0, 53);
		ct[4] = new City("���[�}�@�@�@�@",25.6, 78);
		ct[5] = new City("���`�@�@�@�@",29.8, 77);
		ct[6] = new City("�����h���@�@�@",21.5, 84);
		ct[7] = new City("���X�N���@�@�@",18.2, 74);
		ct[8] = new City("�V�J�S�@�@�@�@",24.6, 68);
		ct[9] = new City("�j���[���[�N�@",26.5, 64);
		
		double maxDI = 0.0;
		double minDI = 100.0;
		String maxCityName = "";
		String minCityName = "";
		
		System.out.println("�@�s�s���@�@�@�C���@���x�@�s���w��");
		
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
				"7���̕s���w�����ő�̓s�s��%s�ŁA�s���w����%2.2f�ł�\n",
				maxCityName.trim(), maxDI);
		System.out.printf(
				"7���̕s���w�����ŏ��̓s�s��%s�ŁA�s���w����%2.2f�ł�\n",
				minCityName.trim(), minDI);
	}
}
