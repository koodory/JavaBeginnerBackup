package java0128.fileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {

	public static void main(String[] args) throws IOException {
		// ��¸���
		DataOutputStream out = new DataOutputStream(new FileOutputStream("d:\\data.dat"));
		out.writeInt(100);
		out.writeBoolean(true);
		//out.writeBytes("Bit Academy");
		out.writeChar('A');
		out.writeUTF("Hello"); 
		
		//d:\\data.dat �Է��� �޾� �ֿܼ� ���
		DataInputStream in = new DataInputStream(new FileInputStream("d:\\data.dat"));
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		//System.out.println(in.readUTF());
		System.out.println(in.readChar());
		System.out.println(in.readUTF()); //���ڿ� �Է� �޼ҵ�(String ����)
	}

}
