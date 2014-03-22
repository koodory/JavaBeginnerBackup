package java0128.fileIO;

import java.io.File;

public class FileDirTest {

	public static void main(String[] args) {
		File dir = new File("d:\\");
		String[] fileList = dir.list();
		for(String str:fileList)
			System.out.println(str);
	}
}
