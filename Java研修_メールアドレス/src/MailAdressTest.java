public class MailAdressTest {

	public static void main(String[] args) {
		//	連結メソッド
		String[] o = {
				"A N","","C","SA","IO","D C","as  ","P","  E d","あいうえお"
		};
		System.out.printf("「%s」\n",MailAdress.connectAdress(o));
		
		//	分割メソッド
		String[] x = MailAdress.splitAdress("i.softbank	gmail.com	domcomo		au");
		
		for(String z : x)
			System.out.println(z);
	}

}