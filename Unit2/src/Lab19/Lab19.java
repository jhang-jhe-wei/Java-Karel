package Lab19;



import javax.swing.JFrame;



public class Lab19 extends JFrame {

	public static void main(String[] args) {
		JFrame lab19=new JFrame("Lab19");
		lab19.setSize(400, 400);
		lab19.setLocation(200, 200);
		lab19.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab19.setContentPane(new arraypanel());
		lab19.setVisible(true);
		

		
	    
		

	}

}
