package Lab17;

   import javax.swing.JFrame;

import Lab12.PrizePanel;
    public class Driver17
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab17");
         frame.setSize(408, 438);    //makes the mouse location correct
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         PrizePanel p = new PrizePanel();
         frame.setContentPane(p);
         p.requestFocus();
         frame.setVisible(true);
         
      }
   }
