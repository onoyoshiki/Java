public class MailAdress {
	
	//	メールアドレスをタブ区切りで1つの項目に連結する
	public static String connectAdress(String[] x) {
		String cAdr="";
		
		for(String i : x) {
			//	空白が含まれていた場合、詰める
			if(i.indexOf(" ") != -1)
				i = i.replace(" ", "");
			
			//	なにも含まれていない場合、格納しない
			if(i == "")
				continue;
			
			//	タブ区切りで連結
			cAdr += i + "\t";
		}
		//	末尾のタブを削除し、返却
		return cAdr.substring(0,cAdr.length()-1);
	}
	
	//	メールアドレスをタブ区切りで分割
	public static String[] splitAdress(String x){
		String[] sAdr = x.split("\t");
		
		for(String i : sAdr) {
			
			//	空白が含まれていた場合、詰める
			if(i.indexOf(" ") != -1)
				i = i.replace(" ", "");
		}
		
		return sAdr;
	}
}