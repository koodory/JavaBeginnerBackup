package java0128.fileIO;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
		PrintWriter writer2 = new PrintWriter(System.out);
		writer.println("���� ���޿� 29���� ������ ����ϴ�.");
		writer.flush();
		writer.close();
	}

}
