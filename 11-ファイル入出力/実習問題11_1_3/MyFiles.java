public class MyFiles {
	String fName;
	long fByte;
	String fPath;
	public MyFiles(String fName, long fByte, String fPath) {
		this.fName = fName;
		this.fByte = fByte;
		this.fPath = fPath;
	}
	public String get_fName() {
		return fName;
	}
	public long get_fByte() {
		return fByte;
	}
	public String get_fPath() {
		return fPath;
	}
	public String toString() {
		return String.format("%-30s%, 15d %s\n", fName, fByte, fPath);
	}
}