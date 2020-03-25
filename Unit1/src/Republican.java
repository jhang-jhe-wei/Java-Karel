
public class Republican extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		while(!leftIsClear()&&frontIsClear()&&!nextToABeeper()) {
		move();
		}
		
	}

	@Override
	public void turnToTheNextSegment() {
		if(!leftIsClear()&&!frontIsClear()) {
			turnRight();
		}
		else {
			turnLeft();
			move();
		}
		
	   
	}
	
		
	}


