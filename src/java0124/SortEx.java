package java0124;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SortEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("��");
		list.add("Ű��");
		list.add("��");
		list.add("������");
		list.add("�丶��");
		list.add("����");
		System.out.println("�����ϱ� ��");
		System.out.println(list+"\n");
		
		System.out.println("���� ����");
		Collections.sort(list);
		System.out.println(list+"\n");
		
		System.out.println("�������� ����");
		Collections.reverse(list);
		System.out.println(list+"\n");
		int i=0;
		System.out.println("[ ���� ��� ]\n");
		Iterator<String> it=list.iterator(); //�������̽�, ���Ḯ��Ʈ 
		while(it.hasNext()){ //�迭�� length �Ӽ��̶� ����
			System.out.print(it.next()+" ");
		}
	}
}
