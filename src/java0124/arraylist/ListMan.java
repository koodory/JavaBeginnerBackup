package java0124.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMan {

	public static void main(String[] args) {
		String[] names={"������","����","���ѹ�","�����","������" };
		String[] genders = {"����","����","����","����","����"};
		int[] ages = {28, 25, 21, 21, 20};
		ArrayList<Man> list = new ArrayList<Man> ();
		for(int i=0; i<5; i++){
			list.add(new Man(names[i], genders[i], ages[i]));
		}
		Iterator<Man> it=list.iterator();
		while(it.hasNext()){
			Man man = (Man)it.next();// Man ��ü ���� �����ϰ� ���� ��ȯ 
			System.out.println("���� : "+man.getName());
			System.out.println("���� : "+man.getGender());
			System.out.println("���� : "+man.getAge());
			man.walk();
			man.stop();
			System.out.println("===================================");
		}
	}
}
