package DataTypes;

import javax.swing.*;
public class DataTypesExercise{

   public static void main (String [] args){
      char d = 68;
      char h = 104;
      char i = 105;
      char y = 121;
      char a = 97;
      
      System.out.println (" " + d + h + i + y + a);
      
      System.out.println ("Stock exercise");
      
      System.out.println ("ITEM \t ITEM CODE \t QUANTITY");
      System.out.println ("T-shirt \t    537 \t    350");
      System.out.println ("Dress \t    7231 \t 480");
      System.out.println ("Earrings \t 7732 \t 90");
      
      System.out.println ("\nPERSONALDETAILS2");
      
      String name;
      String surname;
      String telnum;
      String YearOfBirth;
      String height;
      
      telnum = JOptionPane.showInputDialog ("Enter your phone number, no spaces in between");
      YearOfBirth = JOptionPane.showInputDialog ("Enter your birth year");
      height = JOptionPane.showInputDialog ("What is your height (in metres with 1 decimal point)");
      name = JOptionPane.showInputDialog ("What is your name?");
      surname = JOptionPane.showInputDialog ("What is your surname?");
      
      JOptionPane.showInputDialog (null, "NAME: " + name + " " + surname + "\nYEAR OF BIRTH " + YearOfBirth + "\nHEIGHT(m): " + height + "\nTELEPHONE NUMBER:" + telnum, "PERSONAL DETAILS", JOptionPane.PLAIN_MESSAGE);
  
   }

}