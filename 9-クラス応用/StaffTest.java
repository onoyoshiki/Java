
public class StaffTest {

	public static void main(String[] args) {
		Staff stf = new Staff("010-0534", "�a��@�q", 200000, 12);
		Manager mgr = new Manager("030-0755", "��䒉��", 250000, 17, 9);
		PartTimer prt = new PartTimer("000-0431", "�����I�q", 145.25, 1065);
		
		System.out.printf(" �R�[�h:%s\n ����:%s\n ���^:%,d�~\n\n ", 
				stf.getCode(), stf.getName(), stf.getEarnings());
		System.out.printf(" �R�[�h:%s\n ����:%s\n ���^:%,d�~\n\n ", 
				mgr.getCode(), mgr.getName(), mgr.getEarnings());
		System.out.printf(" �R�[�h:%s\n ����:%s\n ���^:%,d�~\n\n ", 
				prt.getCode(), prt.getName(), prt.getEarnings());
	}

}
