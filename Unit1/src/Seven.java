
public class Seven extends Digit {

	public Seven(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		super.segment1_On();
		super.segment2_On();
		super.segment3_On();
		super.segment4_Off();
		super.segment5_Off();
		super.segment6_Off();
		super.segment7_Off();

	}

}
