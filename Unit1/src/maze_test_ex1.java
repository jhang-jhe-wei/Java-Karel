import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.util.Coordinate;

public class maze_test_ex1 {
	static ArrayList<Coordinate> path=null;
	public static ArrayList<Coordinate> process(ArrayList<Coordinate> path,int size) {
		Iterator<Coordinate> iterator=path.iterator();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			for(int j=(i+1);j<size;j++) {
				if(path.get(i).equals(path.get(j))) {
					System.out.println("same at i:"+i+"and"+"j:"+j);
					iterator=path.iterator();
					for(int z=0;z<=i;z++) {
						iterator.next();
					}
					for(int delete=0;delete<(j-i);delete++) {
						iterator.remove();
						iterator.next();
						}
					System.out.println("after fix");
					for(Coordinate prompt:path) {
						System.out.println("x:"+prompt.x+"    y:"+prompt.y);
						}
					return process(path, path.size());
				}
			}
		}
		System.out.println("final:"+path.size());
		for(Coordinate prompt:path) {
			System.out.println("x:"+prompt.x+"    y:"+prompt.y);						
		}
		return path;
	}
	public static void main(String[] args) {
		String all[]= {"maze1","maze2","maze3","maze4","maze9","maze10","maze11"};
		Object worldname=JOptionPane.showInputDialog(null, "choose the world", "world", JOptionPane.INFORMATION_MESSAGE, null, all, all[0]);
		Display.openWorld("maps/"+worldname+".map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		path=new ArrayList<>();
		Athlete mouse=new Athlete(1,1,Display.EAST,Display.INFINITY);
		path.add(new Coordinate(mouse.getX(), mouse.getY()));
		while(mouse.nextToABeeper()!=true) {
			if(mouse.rightIsClear()==true) {
				mouse.turnRight();
				mouse.move();
				path.add(new Coordinate(mouse.getX(), mouse.getY()));
			    continue;
			}
			else if(mouse.frontIsClear()==true) {
				mouse.move();
				path.add(new Coordinate(mouse.getX(), mouse.getY()));
			    continue;
			}
			else {
				mouse.turnLeft();
			   	continue;
			}
	}		
		path=process(path, path.size());
		mouse.putornot="yes";
		mouse.pickBeeper();
		for(int i=0;i<path.size();i++) {
			if(mouse.getX()>(path.get(path.size()-1-i).x))mouse.left();
			if(mouse.getX()<(path.get(path.size()-1-i).x))mouse.right();
			if(mouse.getY()>(path.get(path.size()-1-i).y))mouse.down();
			if(mouse.getY()<(path.get(path.size()-1-i).y))mouse.up();
		}
	}
}
