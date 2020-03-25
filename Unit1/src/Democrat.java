
public class Democrat extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		while(!rightIsClear()&&frontIsClear()&&!nextToABeeper()) {
		move();
		}
		
	}

	@Override
	public void turnToTheNextSegment() {
		if(!rightIsClear()&&!frontIsClear()) {
			turnLeft();
		}
		else {
			turnRight();
			move();
		}
 
	}
	
	 }
