package Lab13;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class ProjectPanel extends JPanel {
	private BufferedImage myImage;
	private Graphics2D myBuffer;
	private int FrameX=700,FrameY=500;
	private ImageIcon thomas=new ImageIcon("F:\\Computer science\\Unit2\\src\\Lab02\\DS.jpg");
	private javax.swing.Timer t1;
	private javax.swing.Timer t2;
	int setx=50;
	
	

	public ProjectPanel() {
		super();
		myImage=new BufferedImage(FrameX, FrameY, BufferedImage.TYPE_INT_RGB);
		myBuffer=(Graphics2D)myImage.getGraphics();
		myBuffer.setColor(Color.PINK);
		myBuffer.fillRect(0,0,FrameX, FrameY-200);
		myBuffer.setColor(Color.PINK.darker());
		myBuffer.fillRect(0,FrameY-200,FrameX, 200);
		
		t1=new javax.swing.Timer(30, new Action1());
		t1.start();
		t2=new javax.swing.Timer(2000,new Action2());
		
	
		
		
	}
	
	public void body(Graphics2D myBuffer,int x) {
		myBuffer.setStroke(new BasicStroke(10.0f));
		myBuffer.setColor(Color.blue);
		myBuffer.drawImage(thomas.getImage(), x, 50, 100, 100, null);
		myBuffer.drawLine(x+50, 150, x+50, 300);
		myBuffer.drawLine(x+50, 300, x, 350);
		myBuffer.drawLine(x+50, 300, x+100, 350);
		myBuffer.drawLine(x+100, 120, x+130, 170);
		
		
		
		
	}
	
	
	 private class Action1 implements ActionListener
     {
   	   
         public void actionPerformed(ActionEvent e)
        {
        	 setx +=5;
        	 myBuffer.setColor(Color.PINK);
     		myBuffer.fillRect(0,0,FrameX, FrameY-150);
     		myBuffer.setColor(Color.PINK.darker());
     		myBuffer.fillRect(0,FrameY-150,FrameX, 150);       	 
        	 body(myBuffer,setx );
             
           if (setx>=200) {
			t1.stop();
			myBuffer.setColor(Color.black);
			myBuffer.setFont(new Font("setif", Font.BOLD, 20));
			myBuffer.drawString("為什麼我們的主角不想要傳火呢?", 380, 100);
			myBuffer.setStroke(new BasicStroke(5.0f));
			myBuffer.drawOval(370, 70, 350, 50);
			t2.start();
		}
             
            
             repaint();
        }}
	 private class Action2 implements ActionListener
     {
   	   
         public void actionPerformed(ActionEvent e)
        {
       	 
        	 myBuffer.setColor(Color.red);
        	 myBuffer.setStroke(new BasicStroke(10.0f));
        	 myBuffer.drawString("不死人:好好玩你的遊戲,問這麼多幹嘛!?", 330, 300);
             
            
             
            
             repaint();
        }}
         
         public void paintComponent(Graphics g) {
		
		
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

}
