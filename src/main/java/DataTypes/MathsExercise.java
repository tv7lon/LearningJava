package DataTypes;

import javax.swing.*;

public class MathsExercise{

   public static void main (String [] args){
   
   String realNumStr;
   
   realNumStr = JOptionPane.showInputDialog ("Enter a num with 3+ decimals");
   
   double realNumDbb = Double.parseDouble (realNumStr);
   realNumDbb = realNumDbb * 100;
   
   System.out.println (realNumDbb);
   realNumDbb = Math.round (realNumDbb);
   realNumDbb = realNumDbb/100;
   
   System.out.println ("Rounded answer is " + realNumDbb);
   
   
   
   
   }

}