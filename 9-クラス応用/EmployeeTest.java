public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] emp = new Employee[6];
		emp[0] = new StaffAbs("010-0534", "a‘ò@q", 200000, 12);
		emp[1] = new StaffAbs("010-0122", "–îŒp‹|", 200000, 9);
		
		emp[2] = new ManagerAbs("030-0755", "óˆä’‰•Û", 250000, 17, 9);
		emp[3] = new ManagerAbs("030-0492", "’Mˆä—å¡", 250000, 16, 11);
		
		emp[4] = new PartTimerAbs("000-0431", "­“‡‹Iq", 145.25, 1065);
		emp[5] = new PartTimerAbs("000-0176", "à•”‚«‚ñ", 138.50, 980);
		
		for(int i=0; i<emp.length; i++) {
			System.out.printf(" ƒR[ƒh:%s\n –¼:%s\n ‹‹—^:%,d‰~\n\n ", 
			emp[i].getCode(), emp[i].getName(), emp[i].getEarnings());
		}
		
	}

}
