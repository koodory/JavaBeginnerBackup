package imageloader;

import java.awt.*;
import java.lang.reflect.Field;

import javax.swing.*;

public class ImageController {
	
	public static void main(String[] args) {	
		JFrame frame = new JFrame("Image Loader");
		JLabel dir = new JLabel("NO SELECTION",JLabel.CENTER);
		frame.setLocation(500,200);
		frame.setPreferredSize(new Dimension(720,540));
		Container contentPane = frame.getContentPane(); //��Ʈ�� ������ = �̹��� ������ + �ؽ�Ʈ ������
		ImagePanel imagePanel = new ImagePanel(); 
		contentPane.add(imagePanel,BorderLayout.CENTER); //�̹��� �������� ���� �߾�
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(2, 1));
		JButton button = new JButton("Select an image-file");
		controlPanel.add(button); // ��ư
		controlPanel.add(dir,BorderLayout.CENTER); // ���丮 ��� 
		contentPane.add(controlPanel,BorderLayout.SOUTH); //�Ʒ� �����ӿ� ���		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �ݱ�
		button.addActionListener(
			new LoadActionListener(dir,imagePanel));
		
		frame.pack();
		frame.setVisible(true);
	}
}
