package lottogenerator;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoTest extends JFrame implements ActionListener{
	JLabel resultLbl;
	public LottoTest() {
		super("�ζ� ���α׷�"); //Object�� ���� - windowâ �������� ���
		JPanel panel=new JPanel(); //��ư�� ���� ������ ��
		JButton but=new JButton("�ζ� ��ȣ ��"); //��ư��
		but.addActionListener(this); //��ư �̺�Ʈ ������ ��, ��ư�� �۵���Ŵ
		panel.add(but); //�гο� ��ư �߰�
		resultLbl=new JLabel("PRESS THE BUTTON", JLabel.CENTER); //���̺� ��� �� ��ġ ����
		resultLbl.setFont(new Font("Courier New", Font.BOLD, 16)); //���̺� ��Ʈ ����
		add(panel, "South"); //��� ��ġ ����
		add(resultLbl, "North"); //���̺� ��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE);//����� ���α׷� ����
		setBounds(490,414,300,100); //��ü ������ ��ġ �� ũ��
		setVisible(true); // q���̱�
	}

	public static void main(String[] args) {
		new LottoTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int[ ] arr = new int[7];
		String nums="";
		Random random=new Random();
		for (int i = 0; i < 7; i++) {
			arr[i] = random.nextInt(45)+1;
			if( i >0 )
			{
				for(int j=0; j<i; j++){
					if(arr[i] == arr[j]){
						i--;
					}
				}
			}
		}
		System.out.println("");
		for(int i=0;i<7;i++){
			nums+=arr[i]+"  ";
		}
		resultLbl.setText(nums);
	}

}
