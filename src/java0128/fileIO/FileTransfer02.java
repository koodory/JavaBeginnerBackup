package java0128.fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransfer02 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("c:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg"));
		File file=new File("d:\\�׸�");
		file.mkdir();
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:\\�׸�\\Koala.jpg"));
		
		byte[] data = new byte[1024]; // ���۴� 1����Ʈ ó��, 1024 bit��ŭ �ѹ� byte�迭�� ���尡��
		int length, size = 0;
		while((length = in.read(data))!= -1){ 
			out.write(data,0,length); //0���� �迭�� ���̸�ŭ ����(offset)
			size+=length; //�迭 ũ�� ����
		}
		System.out.println("������ ũ�� : "+size+"bytes");
		out.flush(); //���� ���
		in.close();
		out.close();
	}

}
