public class PaymentTest {
	public static void main(String[] args) {
		Payment[] pmt = new Payment[10];
		
		pmt[0] = new StaffInter("010-0534", "�a��@�q", 200000, 12);
		pmt[1] = new StaffInter("010-0122", "��p�|��", 200000, 9);
		pmt[2] = new StaffInter("010-0883", "�������", 200000, 8);
		pmt[3] = new StaffInter("010-0521", "�����@��", 200000, 10);
		
		pmt[4] = new ManagerInter("030-0255", "��䒉��", 250000, 17, 9);
		pmt[5] = new ManagerInter("030-0392", "�M��厡", 250000, 16, 11);
		
		pmt[6] = new PartTimerInter("000-0431", "�����I�q", 145.25, 1065);
		pmt[7] = new PartTimerInter("000-0676", "��������", 138.50, 980);
		pmt[8] = new PartTimerInter("000-1505", "����t��", 125.50, 950);
		pmt[9] = new PartTimerInter("000-0184", "���q�L��", 140.75, 920);
		
		for(int i=0; i<pmt.length; i++) {
			System.out.print(pmt[i]);
		}
	}
}