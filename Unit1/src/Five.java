
public class Five extends Digit {
 
	public Five(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		super.segment1_On();
		super.segment2_Off();
		super.segment3_On();
		super.segment4_On();
		super.segment5_Off();
		super.segment6_On();
		super.segment7_On();
	}

}
