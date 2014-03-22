package java0115;

public class RunMakeTV {

	void printInfoTv(TV tv){ // �޸� ��ü�� �ּҰ� ���(call by reference)
		
		System.out.println("========== TV ==========");
		System.out.println("��ǰ�� : "+tv.getProductName());
		System.out.println("ũ�� : "+tv.getSize());
		System.out.println("�𵨹�ȣ : "+tv.getModelNumber());
		System.out.println("����ä�� : "+tv.getChannel());
		System.out.println("���纼�� : "+tv.getVolume());
	}
	public static void main(String[] args) {
		RunMakeTV run = new RunMakeTV(); 
		TV tv=new TV("Smart TV","LG6570AB",55,15,10);

//		Smart TV
		// static���������� heap���� ������ �ȵǱ⿡ ��ü ���� �ٽ� �ؾ���
		run.printInfoTv(tv); //�̹� ��� �������� tv�� �޼ҵ忡 ����
// 		ä�ι�ư�� ���� 3�� ����		
		for(int i=0;i<3;i++){
		tv.upChannel();
		}
// 		ä�κ����� �Ʒ��� 5�� ����		
		for(int i=0;i<5;i++){
		tv.downVolume();
		}
		run.printInfoTv(tv);
//		tv = null; // ��� 1: garbage collector�� �������� tv�� �Ҹ��Ŵ	
//		3D Smart TV
//		TV _3d = new TV("3D Smart TV", "SS2346BKR", 70, 20, 5);
//		run.printInfoTv(_3d);
		tv = new TV("3D Smart TV", "SS2346BKR", 70, 20, 5); // ������ ����
		run.printInfoTv(tv); // ��� 2: ���� ������ ����
	}
}
