import java.util.Scanner;
import java.util.Calendar;
import java.io.File;

public class FileList {
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
			System.out.printf("�t�@�C����:%,d\n", fileCounter);
			System.out.printf("�o�C�g��:%,d\n", byteCounter);
		}
		System.out.printf("�t�@�C����:%,d\n", fileCounter);
		System.out.printf("�o�C�g��:%,d\n", byteCounter);
	}
	
	static void listUpPath(File dirName) {
		Calendar cal = Calendar.getInstance();
		
		String[] pathList = dirName.list();
		
		for(int i=0; i<pathList.length; i++) {
			String path = pathList[i];
			
			File myDirFile = new File(dirName, path);
			
			if(myDirFile.isDirectory()) {
				listUpPath(myDirFile);
			}else {
				cal.setTimeInMillis(myDirFile.lastModified());
				System.out.printf("�t�@�C����:%s\n", myDirFile.getName());
				System.out.printf("�e�f�B���N�g����:%s\n", myDirFile.getParent());
				System.out.printf("�o�C�g��:%d\n", myDirFile.length());
				System.out.printf("�ŏI�X�V����:%s\n\n", cal.getTime());
				
				fileCounter++;
				byteCounter += myDirFile.length();
			}
		}
	}
}