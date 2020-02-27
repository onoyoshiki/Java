import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MyFielTest {
	static int fileCounter = 0;
	static int byteCounter = 0;
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("ディレクトリ名");
		String inputDir = scan.nextLine();
		File dirName = new File(inputDir);
		
		if(dirName.exists())
			listUpPath(dirName);
		else {
			System.out.printf("ありません");
			System.exit(1);
		}
		System.out.printf("ファイル数:%,d\n", fileCounter);
		System.out.printf("バイト数:%,d\n", byteCounter);
	}
	
	static void listUpPath(File dirName) {
		String[] pathList = dirName.list();
		
		for(int i=0; i<pathList.length; i++) {
			String path = pathList[i];
			
			File myDirFile = new File(dirName, path);
			
			if(myDirFile.isDirectory()) {
				listUpPath(myDirFile);
			}else {
				MyFiles myfiles = new MyFiles(myDirFile.getName(),myDirFile.length(),myDirFile.getParent());
				ArrayList<String> cityList = new ArrayList<String>();
				cityList.add(myfiles.toString());
				System.out.printf(cityList.get(0));
				fileCounter++;
				byteCounter += myDirFile.length();
			}
		}
	}
}