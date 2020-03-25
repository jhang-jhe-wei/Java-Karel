import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.util.Coordinate;
/**
 * 
 * @author 張哲瑋 B10730224 wells
 * 2018/12/27
 *
 */
public class Lab10ext {
	/**
	 * 宣告一個存放座標(coordinate)的ArrayList
	 */
	static ArrayList<Coordinate> path=null;
	/**
	 * 
	 * 把丟入的ArrayList查驗，假如有重複的2點，刪除中間的部分後重新呼叫，直至沒有重複後回傳，以此確保路徑不會有重複
	 */
	public static ArrayList<Coordinate> process(ArrayList<Coordinate> path,int size) {
		System.out.println(size);
		/**
		 * 由於走訪陣列是以最初開始訪問整個ArrayList，導致動態刪除時會發生錯誤，因此以最後的數目開始訪問整個ArrayList可以避免出錯
		 */
		for(int i=0;i<size;i++) {
			for(int j=(i+1);j<size;j++) {
				if(path.get(i).equals(path.get(j))) {
					System.out.println("same at i:"+i+"and"+"j:"+j);
					for(int z=0;z<(j-i);z++) {
						path.remove(i);
					}
					System.out.println("after fix");
					for(Coordinate prompt:path) {
						System.out.println("x:"+prompt.x+"    y:"+prompt.y);
						}
					/**
					 * 為了預防刪除後整個ArrayList還有重複的點，因此重新呼叫該Method
					 */
					return process(path, path.size());
				}
			}
		}
		System.out.println("final:"+path.size());
		for(Coordinate prompt:path) {
			System.out.println("x:"+prompt.x+"    y:"+prompt.y);						
		}
		/**
		 * 當ArrayList沒有重複時，回傳!
		 */
		return path;
	}
	/**
	 * 流程:創造2個Robot，以下以A&B代稱，首先先由A以右手定則的方案探索整張地圖，每走一步就把目前的coordinat加入ArrayList，但由於我把Display.Step()屏蔽了，導致使用者看不到A在跑，在A移動到終點後把ArrayList丟入process()做分析，重複的路徑刪除，以此取得最短路徑，把Display.Step()恢復，最後再由B讀取ArrayList完成任務。
	 * 
	 * 至於選單的Auto就只是以for迴圈重複跑全部的地圖而已
	 * 打印內容可看到ArrayList的刪除過程
	 */
	public static void main(String[] args) {
		/**
		 * 此部分只是選擇地圖和基本參數
		 */
		String all[]= {"maze1","maze2","maze3","maze4","maze9","maze10","maze11","Auto"};
		Object worldname=JOptionPane.showInputDialog(null, "choose the world", "world", JOptionPane.INFORMATION_MESSAGE, null, all, all[7]);
		int times=1;
		int maps=0;
		System.out.println(worldname);
		if(worldname!="Auto") {
		Display.openWorld("./maps/"+worldname+".map");}
		else if(worldname=="Auto") {
			times=-2;
		Display.openWorld("maps/"+all[maps]+".map");
			}		
		Display.setSpeed(5);
		for(int loop=0;loop<times||times==-2;loop++) {
			if(worldname=="Auto") {
				Display.openWorld("maps/"+all[maps]+".map");
				}
			
			
		// 把Robot設定為不會顯現			
		Athlete.displayornot=false;
		path=new ArrayList<>();
		//創造A
		Athlete mouse=new Athlete();
	    //ArrayList加入A的初始位置
		path.add(new Coordinate(mouse.getX(), mouse.getY()));
		
		/**
		 * 此部分只是右手定則的code
		 */
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
		//把站在終點的A刪除
		mouse.explode();
		//處理剛剛由A走過的ArrayList
		path=process(path, path.size());
		//創造出B
		mouse=new Athlete(1,1,Display.EAST,Display.INFINITY);
		//把機器人顯現恢復
		Athlete.displayornot=true;
		//使機器人每走一步都會放一個Beeper
		mouse.putornot="yes";
		//讀取ArrayList，並以單前的位置與ArrayList中的座標比較，決定該怎麼走
		for(Coordinate prompt:path) {
			if(mouse.getX()>prompt.x)mouse.left();
			if(mouse.getX()<prompt.x)mouse.right();
			if(mouse.getY()>prompt.y)mouse.down();
			if(mouse.getY()<prompt.y)mouse.up();
		   }
		//完!!!!!!!!!!!!!!
		
		//這部分不重要!!
		if(worldname=="Auto") {
			maps++;
			maps %=7;
			}
	    }
	}
}
