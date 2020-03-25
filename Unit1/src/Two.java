
public class Two extends Digit {

	public Two(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		super.segment1_On();
		super.segment2_On();
		super.segment3_Off();
		super.segment4_On();
		super.segment5_On();
		super.segment6_Off();
		super.segment7_On();

	}

}
