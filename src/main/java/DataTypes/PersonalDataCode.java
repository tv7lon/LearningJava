package DataTypes;

import javax.swing.*;
// //imports have to go before public class line

   public class PersonalDataCode{


      public static void main(String [] args){
   
      //HOW TO USE DATA TYPES
      //declare as strings, get inputs (as strings), convert using parse...
      
        //declaring variables
         String phoneNumStr, birthYearStr, heightStr, nameStr, surnameStr;
        
         //getting input
         
         phoneNumStr = JOptionPane.showInputDialog ("Enter your phone number, no spaces in between");
         birthYearStr = JOptionPane.showInputDialog ("Enter your birth year");
         heightStr = JOptionPane.showInputDialog ("What is your height (in cm)");
         nameStr = JOptionPane.showInputDialog ("What is your name?");
         surnameStr = JOptionPane.showInputDialog ("What is your surname?");
         
         int birthYear = Integer.parseInt (birthYearStr);
         double height = Double.parseDouble (heightStr);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
   
         System.out.println ("Your phone number is " + phoneNumStr);
         System.out.println ("You are born in " + birthYearStr);
         System.out.println ("Your height is " + heightStr + " cm");
         System.out.println ("Your name is " + nameStr);
         System.out.println ("Your surname is " + surnameStr);
              
     
     
  

  
   
    
   

   }
}