  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.22.2003

   


import javax.swing.JOptionPane;


import edu.fcps.karel2.Display;

    public class Lab07
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?\n"
         		+ "mountain1, mountain2, mountain3\r\n" + 
         		"hill1, hill2, hill3\r\n" + 
         		"step1, step2, step3\r\n" + 
         		"");
         String type = JOptionPane.showInputDialog("What type of climber?Climber,HillClimber,StepClimber");
         String avenue = JOptionPane.showInputDialog("What x-coordinate?8 10 12");
         int x = Integer.parseInt(avenue);
      
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(17, 15);
         Display.setSpeed(10);
      
         if(type.equals("Climber"))
         {
            Mountain.explore( new Climber(x) );
         }
         else if(type.equals("HillClimber"))
         {
            Mountain.explore(new HillClimber(x));
     }
         else if(type.equals("StepClimber"))
         {
            Mountain.explore( new StepClimber(x) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
        
     
       
 
      }
       
   }