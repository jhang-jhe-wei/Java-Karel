import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;
import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Wall;
import edu.fcps.karel2.WorldBackend;
import edu.fcps.karel2.WorldFrame;

public class snake {
	static KeyListener keyListener;
	static Athlete athlete;
	static ArrayList<Athlete> robotList;
	static Timer timer;

	public static void main(String[] args) {
		
		
	    
		Display.openWorld("./snake.map");
		Display.setSpeed(10);
		athlete = new Athlete();
		keyListener = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				whenKeyPressed(e);
			}
		};
		WorldFrame.getCurrent().addKeyListener(keyListener);
		WorldFrame.getCurrent().setFocusTraversalKeysEnabled(false);
		robotList = new ArrayList<>();
		robotList.add(athlete);
		generateApple();
		timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				timer_tick();
			}
		}, 500, 300);
	}

	public static void timer_tick() {
		robotMove();
		if(athlete.nextToARobot()) {
			dead();
		}
		for (Athlete run : robotList) {
			if (run.nextToABeeper()) {
				run.pickBeeper();
				generateBody();
				generateApple();
				break;
			}
		}
	}

	public static void dead() {
		try {
			System.in.read();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.exit(0);
	}

	public static void generateApple() {
		// Athlete athlete = new Athlete();
		Random random = new Random();
		int x = random.nextInt(9) + 1;
		int y = random.nextInt(9) + 1;

		WorldBackend.getCurrent().putBeepers(x, y, 1);
	}

	public static void generateBody() {
		Athlete tmp = new Athlete(robotList.get(robotList.size() - 1).getX(),
				robotList.get(robotList.size() - 1).getY(), robotList.get(robotList.size() - 1).getDirection(), 0);
		robotList.add(tmp);
	}

	public static void robotMove() {
		Athlete.displayornot = false;
		Point tmp = new Point(athlete.getX(), athlete.getY());
		athlete.move();
		for (int i = 1; i < robotList.size(); i++) {
			Point tPoint = new Point(robotList.get(i).getX(), robotList.get(i).getY());
			robotList.get(i).moveTo(tmp.x, tmp.y);
			tmp = tPoint;
		}
		Athlete.displayornot = true;
		Athlete.Step();
	}

	public static void whenKeyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			 if(!robotList.get(0).facingNorth()&&!robotList.get(0).facingSouth()) 
			athlete.facingup();
			break;
		case KeyEvent.VK_DOWN:
			 if(!robotList.get(0).facingNorth()&&!athlete.facingSouth()) 
			athlete.facingdown();
			break;
		
		case KeyEvent.VK_LEFT:
			if(!athlete.facingEast()&&!athlete.facingWest()) 
			athlete.facingleft();
			break;
		case KeyEvent.VK_RIGHT:
			if(!athlete.facingEast()&&!athlete.facingWest()) 
			athlete.facingright();
			break;
		case KeyEvent.VK_SPACE:
			
			break;
		default:
			break;
		}

	}
}