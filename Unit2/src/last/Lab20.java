package last;

import java.io.File;

import javax.swing.JFrame;

import org.magiclen.media.AudioPlayer;
import org.omg.CORBA.PRIVATE_MEMBER;


public class Lab20 extends JFrame {

	public static void main(String[] args) {
		JFrame lab20=new JFrame("Lab20");
		lab20.setSize(800, 800);
		lab20.setLocation(200, 200);
		lab20.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab20.setContentPane(new finalPanel());
		lab20.setVisible(true);

	}

}
