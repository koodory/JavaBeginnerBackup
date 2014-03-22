package imageloader;

import javax.swing.*;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.*;

public class LoadActionListener implements ActionListener{
	Frame text;
	JLabel label;
	ImagePanel imagePanel;
	FileDialog fDialog = new FileDialog(text,"image file",FileDialog.LOAD);
	public LoadActionListener(JLabel dir, ImagePanel imagePanel) {
		this.label = dir;
		this.imagePanel = imagePanel;
	}
	public void actionPerformed(ActionEvent e){
		fDialog.setVisible(true);
		String path = fDialog.getDirectory()+fDialog.getFile();
		label.setText(path);
		imagePanel.setPath(path);
		imagePanel.repaint();
	}
}
