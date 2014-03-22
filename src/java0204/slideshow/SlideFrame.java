package java0204.slideshow;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SlideFrame extends JFrame {
	Image img;
	Frame frame;
	Toolkit tool;
	JTextField input;
	SlideThread thread;
	JPanel pan;
	boolean flagPlay = true;
	FileDialog fDialog;
	String filename;
	public SlideFrame(){
		tool = Toolkit.getDefaultToolkit();
		img = tool.createImage("0.jpg");
		pan = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);		
				g.drawImage(img, 0,0,800,600,this);
			}
		};
		add(pan);
		pan.setBackground(Color.BLACK);
		JPanel sPan = new JPanel();
		JLabel txt = new JLabel("�ð����� : ");
		input = new JTextField(5);
		JLabel sec = new JLabel("��");
		JButton but = new JButton("����");
		JButton butFwd = new JButton(">>");
		JButton butPlay = new JButton("�� / ��");
		JButton butBwd = new JButton("<<");
		JButton butFile = new JButton("���Ͽ���");
		sPan.add(txt);
		sPan.add(input);
		sPan.add(sec);
		sPan.add(but);
		sPan.add(butBwd);
		sPan.add(butPlay);
		sPan.add(butFwd);
		sPan.add(butFile);
		add(sPan,BorderLayout.SOUTH);
		thread = new SlideThread(this,pan);//������ ��
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thread.setSec(Double.parseDouble(input.getText()));
			}
		});
		butBwd.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				thread.setFlag(false);
			}
		});
		butFwd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thread.setFlag(true);	
			}
		});
		butPlay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(thread.getFlagStatus() == false){
					thread.flagStop = true;
				}else{
					thread.flagStop = false;
				}
			}
		});
		fDialog = new FileDialog(frame,"�̹��� ���� ����",FileDialog.LOAD);
		butFile.addActionListener(new ActionListener() {
			@Override
			public synchronized void actionPerformed(ActionEvent e) {
				fDialog.setVisible(true);	
				thread.setFile(fDialog.getDirectory()+fDialog.getFile());
				thread.setFlagFile(true);
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10,10,800,600);
		setVisible(true);
		thread.start();
	}
	public void setFilename(String filename){ //�����̸� ����
		this.filename = filename;
		img = tool.createImage(filename);
	}
	public static void main(String[] args) {
		new SlideFrame();
	}
}
