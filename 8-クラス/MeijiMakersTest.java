public class MeijiMakersTest {
	public static void main(String[] args) {
		
		MeijiMakers[] mm = new MeijiMakers[10];
		
		mm[0] = new MeijiMakers("中島　三郎助", 1821, 1869, "戦死");
		mm[1] = new MeijiMakers("勝　海舟　　", 1823, 1899, "病死");
		mm[2] = new MeijiMakers("岩倉　具視　", 1825, 1883, "病死");
		mm[3] = new MeijiMakers("西郷　隆盛　", 1828, 1877, "戦死");
		mm[4] = new MeijiMakers("吉田　松陰　", 1830, 1859, "刑死");
		mm[5] = new MeijiMakers("大久保　利通", 1830, 1878, "暗殺");
		mm[6] = new MeijiMakers("木戸　孝允　", 1833, 1877, "病死");
		mm[7] = new MeijiMakers("坂本　龍馬　", 1836, 1867, "暗殺");
		mm[8] = new MeijiMakers("高杉　晋作　", 1839, 1867, "病死");
		mm[9] = new MeijiMakers("伊藤　博文　", 1841, 1909, "暗殺");
		
		for(int i=0; i<mm.length; i++)
			System.out.printf("%s: 生年%s 没年%s 享年%d %s\n",
					mm[i].getName(), mm[i].getBirthYear(), mm[i].getHeaven(),
					mm[i].getLifeTime(), mm[i].getCause());
	}
}
