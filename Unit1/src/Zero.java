
public class Zero extends Digit {

	@Override
	public void display() {
		super.segment1_On();
		super.segment2_On();
		super.segment3_On();
		super.segment4_On();
		super.segment5_On();
		super.segment6_On();
		super.segment7_Off();
		
	}

	public Zero(int x, int y) {
		super(x, y);
		
	}


}
