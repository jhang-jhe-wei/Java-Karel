import edu.fcps.karel2.Athlete;
import edu.fcps.karel2.Display;

public class Lab004 {
	public static void  taketheField(Athlete all,int x,int y) {
		
	 {
		all.up();
		all.up();
		all.up();
		all.up();
		all.right();//�������@�P�I
		int nowx=2;
		int nowy=5; //�@�P�I�y��
		
		int relx=x-nowx;
		int rely=y-nowy;//�۹�y��
	
		if (relx>0) {
		for(int i=0;i<relx;i++) {
        all.right();			
	    }}
		else if(relx<0) {
		for(int i=0;i>relx;relx ++) {
	        all.left();		
			}}//x�첾
		
		if (rely>0) {
			for(int i=0;i<rely;i++) {
	        all.up();			
			}}
		else if(rely<0) {for(int i=0;i>rely;rely++) {
		        all.down();		
				}}//y�첾
			
		all.facingdown();}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openWorld("maps/arena.map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		
		Athlete a =new Athlete();
		Athlete b =new Athlete();
		Athlete c =new Athlete();
		Athlete d =new Athlete();
		Athlete e =new Athlete();
		Athlete f =new Athlete();
		Athlete g =new Athlete();
		taketheField(a,8,6);
		taketheField(b,7,5);
		taketheField(c,6,7);
		taketheField(d,6,5);
		taketheField(e,5,5);
		taketheField(f,4,6);
		taketheField(g,2,7);
//		for(int i=0;i<1;i++,g.right());
//		for(int i=0;i<6;i++,g.up());
		
		g.facingright();
	   
		
		
		
}}
