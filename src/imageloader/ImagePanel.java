package imageloader;
import java.awt.*;
import java.awt.image.ImageObserver;

import javax.swing.*;
public class ImagePanel extends JPanel {
	Image image;
	Toolkit tool = getToolkit(); 
	void setPath(String path){
		image = tool.getImage(path);
	}
	public void paint(Graphics g){
		g.clearRect(0, 0, getWidth(), getHeight());
		if(image != null){
			g.drawImage(image, 0,0,getWidth(), getHeight(), this);
		}
	}
}
