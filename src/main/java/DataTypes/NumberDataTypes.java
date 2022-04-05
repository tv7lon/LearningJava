package DataTypes;

import javax.swing.*;

public class NumberDataTypes{

   public static void main (String [] args){
      String input = JOptionPane.showInputDialog ("Enter a number");
      System.out.println (input);
            

      int num = Integer.parseInt (input);
      System.out.println (num);
       
   }
}