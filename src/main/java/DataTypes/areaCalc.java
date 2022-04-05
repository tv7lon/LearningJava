package DataTypes;

import javax.swing.*;


public class areaCalc{
   
   public static void main (String [] args){
   
   int randNum = (int)(Math.random() * 30 + 15);
   System.out.print (randNum + " ");
   double answer = ( 1 * (Math.PI * (randNum*randNum)) * 15.68);
   answer = answer/3;
   System.out.println ("The area is " + answer);







   }
}