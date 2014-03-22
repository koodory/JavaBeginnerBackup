package java0204.calendarcreation;

import java.awt.*;

import javax.swing.*;

public class DateTimeController extends JFrame {
	
	public DateTimeController(){
		setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel Lb1= new JLabel("��1 �׽�Ʈ", JLabel.CENTER);
		JLabel Lb2= new JLabel("��2 �׽�Ʈ", JLabel.CENTER);
		Lb1.setFont(new Font("�������",Font.BOLD,30));
		Lb2.setFont(new Font("�������",Font.BOLD,30));
		
		Lb1.setForeground(Color.MAGENTA);
		Lb2.setForeground(Color.ORANGE);
		MyRun my = new MyRun(Lb1,Lb2);
		Thread thread = new Thread(my);
		add(Lb1);
		add(Lb2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500,300,400,150);
		setVisible(true);
		thread.start();
	}
	public static void main(String[] args) {
		new DateTimeController();
		
	}
}
