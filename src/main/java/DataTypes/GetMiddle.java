package DataTypes;

import javax.swing.*;
import java.awt.*; 

public class GetMiddle{
   
   public static void main (String [] args){
   
   String userWordStr; 
   userWordStr = JOptionPane.showInputDialog ("Enter a word");
   
   int wordLength = userWordStr.length();
   System.out.println ("Your word length is " + wordLength);   
   
   char midLet;
   
   midLet = (userWordStr.charAt (wordLength/2));
   
   System.out.println ("Your middle letter is an " + midLet);
   
 
// using char
// using (stringName.charAt (position));






   }
   
}