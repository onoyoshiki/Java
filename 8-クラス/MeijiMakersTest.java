public class MeijiMakersTest {
	public static void main(String[] args) {
		
		MeijiMakers[] mm = new MeijiMakers[10];
		
		mm[0] = new MeijiMakers("�����@�O�Y��", 1821, 1869, "�펀");
		mm[1] = new MeijiMakers("���@�C�M�@�@", 1823, 1899, "�a��");
		mm[2] = new MeijiMakers("��q�@��@", 1825, 1883, "�a��");
		mm[3] = new MeijiMakers("�����@�����@", 1828, 1877, "�펀");
		mm[4] = new MeijiMakers("�g�c�@���A�@", 1830, 1859, "�Y��");
		mm[5] = new MeijiMakers("��v�ہ@����", 1830, 1878, "�ÎE");
		mm[6] = new MeijiMakers("�،ˁ@�F��@", 1833, 1877, "�a��");
		mm[7] = new MeijiMakers("��{�@���n�@", 1836, 1867, "�ÎE");
		mm[8] = new MeijiMakers("�����@�W��@", 1839, 1867, "�a��");
		mm[9] = new MeijiMakers("�ɓ��@�����@", 1841, 1909, "�ÎE");
		
		for(int i=0; i<mm.length; i++)
			System.out.printf("%s: ���N%s �v�N%s ���N%d %s\n",
					mm[i].getName(), mm[i].getBirthYear(), mm[i].getHeaven(),
					mm[i].getLifeTime(), mm[i].getCause());
	}
}
