package DataTypes;

import it.*;
import javax.swing.*;

public class MakeSquare {

   public static void main (String [] args){
      Gogga bug = new Gogga ();
      bug.setPosition(1,5);
      
   String goggaWidthStr;
   
   goggaWidthStr = JOptionPane.showInputDialog ("How thick do you want gogga's tail to be");
   
   int goggaWidth = Integer.parseInt (goggaWidthStr);
 
   System.out.println (goggaWidth);
   bug.setTrailWidth (goggaWidth);
   
   bug.setDirection(Gogga.UP);
   bug.move();
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.RIGHT);
   bug.move();
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.DOWN); 
   bug.move();
   bug.move();
   bug.move();
   
   bug.setDirection(Gogga.LEFT);
   bug.move();
   bug.move();
   bug.move();



   }
}