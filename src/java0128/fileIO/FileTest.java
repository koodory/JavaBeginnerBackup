package java0128.fileIO;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("d://penguins.jpg");
		if(file.exists()){
			System.out.println("���丮 ���� : " +file.isDirectory());
			System.out.println("���Ͽ��� : "+file.isFile());
			System.out.println("����� : "+file.getAbsolutePath());
			System.out.println("������ : "+file.getPath());
			System.out.println("�бⰡ�� : "+file.canRead());
			System.out.println("���Ⱑ�� : "+file.canWrite());
			System.out.println("����ũ�� : "+file.length()+"byte");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}

	}

}
