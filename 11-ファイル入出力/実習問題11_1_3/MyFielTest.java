import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MyFielTest {
	static int fileCounter = 0;
	static int byteCounter = 0;
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("�f�B���N�g����");
		String inputDir = scan.nextLine();
		File dirName = new File(inputDir);
		
		if(dirName.exists())
			listUpPath(dirName);
		else {
			System.out.printf("����܂���");
			System.exit(1);
		}
		System.out.printf("�t�@�C����:%,d\n", fileCounter);
		System.out.printf("�o�C�g��:%,d\n", byteCounter);
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