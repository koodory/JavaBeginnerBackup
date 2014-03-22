package java0128.hw;

import java.awt.Color;
import java.awt.Component;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SelectImageDraw extends JFrame {
	FileDialog fDialog; // ��� �����Ͽ� �޼ҵ� �ۿ����� ���
	Image img; //�ϵ��ũ�� �̹��� ��� Toolkit�� ������ �޾ƾ���
	JPanel pan;
	Toolkit tool;
	ImageObserver observer; // �̹��� ���� ��ü
	int width=500, height=500;
	Boolean flag = false;
	Boolean pop = true;
	int count =0;
	
	public SelectImageDraw(){
		super("������ �̹��� �׸���"); //JFrame�� ���� ���ڿ� ��� or setTitle()
		JButton but=new JButton("���� ����");
		setBounds(10,10,width, height); //������(x,y,����,����)
		tool = Toolkit.getDefaultToolkit(); //��Ŷ �������̽���ü�� ���� ���� ���� �� 
		img=tool.createImage("d:\\Koala.jpg"); // creatImage - �ϵ��ũ�� ������ ������ �̹��� ��ü ��
		pan=new JPanel(){
			@Override
			protected void paintComponent(Graphics g){ //�̹��� �� ����
				super.paintComponent(g);// �̹��� ������ ����, setSize
				  if(flag == true) // ������ ����
				 {
					width = img.getWidth(observer);
					height = img.getHeight(observer);
				 }
				g.drawImage(img, 0, 0, width, height, this); //�̹��� �� �Լ�		
			}
		};
		fDialog = new FileDialog(this, "�̹��� ���� ����", FileDialog.LOAD);//���Ϸε� â ��
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fDialog.setVisible(true);
				String dir = fDialog.getDirectory()+fDialog.getFile();
				img=tool.createImage(dir);
				
				//�̹��� ��ü�� ���	
				//pan.update(getGraphics());
				//getDirectory(): ���丮 ���� , getFile(): ���ϸ� ����
				// ���ϰ�ü �� -> ���� ������ ���� ����-> �μ� ���
				setSize(width,height+65);
				System.out.printf("\nFRAME : WIDTH = %d, HEIGHT = %d",width,height);
				System.out.printf("\nDIR : %s ",dir);
				flag = true; // ������ ���� ����
				pan.repaint();
				}
		});
		pan.setBackground(Color.green);
		add(but,"North");
		add(pan,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE); //â�� ���� ��� ���α׷� ���� 
		setVisible(true); 
	}

	public static void main(String[] args) {
		new SelectImageDraw();
	}
}
