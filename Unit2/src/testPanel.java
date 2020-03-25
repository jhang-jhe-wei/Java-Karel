import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.Timer;

public class testPanel extends JPanel {
	int i=0;
	public testPanel() {
		
	Timer t1=new Timer(50,new ActionListener() {
	@Override
		public void actionPerformed(ActionEvent e) {
			
		repaint();
		}
	});
	
	t1.start();
	}
	
		


	@Override
	protected void paintComponent(Graphics arg0) {
		
		super.paintComponent(arg0);
		i+=20;
		if(i>255) {
			i=0;
		}
//		arg0.setColor(new Color(125,255,255));
//		arg0.fillRect(0, 0, 400, 400);
		
		
	}

	
	
}
