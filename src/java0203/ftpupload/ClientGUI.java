package java0203.ftpupload;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class ClientGUI extends JFrame {
	static String clientAdd = "192.168.0.2";
	static String fileName = null;
	static JLabel trans;
	static int size;
	static FileDialog fDialog; // ��� �����Ͽ� �޼ҵ� �ۿ����� ���
	static Toolkit tool;
	public static void GUI(){
		JFrame frame = new JFrame("FTP ������α׷�");
		trans = new JLabel("No selected File", JLabel.CENTER);
		frame.setLocation(100,100);
		frame.setPreferredSize(new Dimension(300,95));
		Container contentPane = frame.getContentPane();
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(2,1));
		JButton button = new JButton("����� ���� ����");
		controlPanel.add(button);
		controlPanel.add(trans,BorderLayout.CENTER);
		contentPane.add(controlPanel,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fDialog = new FileDialog(frame,"����� ���� ����", FileDialog.LOAD);//���Ϸε� â ��
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				fDialog.setVisible(true);
				fileName = fDialog.getDirectory()+fDialog.getFile();
				trans = new JLabel(fileName, JLabel.CENTER);
				try {
					ClientEx02(clientAdd,fileName);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.pack();
		frame.setVisible(true);	
	}
	public static void ClientEx02(String clientAdd2, String fileName2) throws IOException, IOException{
		Socket s = new Socket(clientAdd,7777);
		BufferedInputStream bufin = new BufferedInputStream(new FileInputStream(fileName));
		BufferedOutputStream bufout = new BufferedOutputStream(s.getOutputStream());
		byte arr[]= new byte[1024];
		int length = 0, size =0;
		while((length = bufin.read(arr))!=-1){
			bufout.write(arr,0,length);
			System.out.println(size+"Byte");
		size += length;
		}
		bufout.flush();
		bufin.close();
		bufout.close();
		s.close();
	}
	public static void main(String[] args) throws Exception{
		ClientGUI GUI = new ClientGUI();
		GUI();
	}
}