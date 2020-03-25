
public class Four extends Digit {

	public Four(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		super.segment1_Off();
		super.segment2_On();
		super.segment3_On();
		super.segment4_Off();
		super.segment5_Off();
		super.segment6_On();
		super.segment7_On();

	}

}
