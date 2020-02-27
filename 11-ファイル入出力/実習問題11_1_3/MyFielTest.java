import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MyFielTest {
	static int byteCounter = 0;
	static ArrayList<MyFiles> cityList = new ArrayList<MyFiles>();
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
		for(int i=0; i<cityList.size(); i++)
			System.out.printf("%s",cityList.get(i));
		System.out.printf("ファイル数:%,d\n", cityList.size());
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
				cityList.add(myfiles);
				byteCounter += myDirFile.length();
			}
		}
	}
}