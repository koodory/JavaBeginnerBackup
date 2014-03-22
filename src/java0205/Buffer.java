package java0205;
import java.util.*;
public class Buffer {
	int data = 0;
	boolean available = false;
	public synchronized int get(){
		while(available == false){ //�Һ��� �Լ�
			try{
				wait(); // �Һ��� ��
			}catch(InterruptedException e){ }
		}
		available = false;
		notifyAll(); // ����ڸ� ���
		return data;
	}
	public synchronized void put(int num){ //����� �Լ�
		while(available == true){
			try{
				wait(); // ����� ��
			}catch(InterruptedException e){ }
		}
		data=num; // ���������� ������ ������ ��ŭ ä��
		available =true;
		notifyAll(); // �Һ��ڸ� ���
	}
}
