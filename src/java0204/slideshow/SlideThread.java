package java0204.slideshow;

import javax.swing.*;

public class SlideThread extends Thread{

	SlideFrame frame;
	JPanel pan;
	int num;
	Boolean flagDirect = true, flagStop = false, flagFile = false;
	double sec = 1;
	final int EndofList = 8;
	String file; 
	public SlideThread(SlideFrame frame, JPanel pan) {
		super();
		this.frame = frame;
		this.pan = pan;
	}
	public synchronized void setSec(double sec){
		this.sec = sec;
		notify();
	}
	public void setFlag(Boolean flagDirect){
		this.flagDirect = flagDirect;
	}
	public void setMode(Boolean flagStop){
		this.flagStop = flagStop;
	}
	public Boolean getFlagStatus(){
		return flagStop;
	}
	public synchronized void setFile(String file){
		this.file = file;
	}
	public synchronized void setFlagFile(Boolean flagFile){
		this.flagFile =flagFile;
	}
	
	
	@Override
	public synchronized void run(){
		NodeList myList = new NodeList();
		myList.insertNode("0.jpg");
		myList.insertNode("1.jpg");
		Node tempNode = myList.pointer;

		while(true){
			if(flagFile == true){
				myList.insertNode(file);
				flagFile = false;
			}
			frame.setFilename(tempNode.getValue());
			System.out.println(tempNode.getValue());
			try {
				wait((long)(sec*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(flagDirect == true && flagStop == false){
				pan.repaint();
				tempNode=tempNode.next;
			}else if(flagDirect == false && flagStop == false){
				pan.repaint();
				tempNode=tempNode.prev;
			}else{
				continue;
			}
			//System.out.println(num);
		}
	}

}
