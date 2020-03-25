
public class Three extends Digit {

	public Three(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		super.segment1_On();
		super.segment2_On();
		super.segment3_On();
		super.segment4_On();
		super.segment5_Off();
		super.segment6_Off();
		super.segment7_On();

	}

}
