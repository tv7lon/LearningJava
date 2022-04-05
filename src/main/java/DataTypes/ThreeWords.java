package DataTypes;

import javax.swing.*;
public class ThreeWords{

   public static void main (String [] args){
   
      String wordOne, wordTwo, wordThree;
      
      wordOne = JOptionPane.showInputDialog ("First word?");
      wordTwo = JOptionPane.showInputDialog ("Second word?");
      wordThree = JOptionPane.showInputDialog ("Third word?");
      
      System.out.println ("Word one has " + wordOne.length() + " characters in it");
      System.out.println ("Word two has " + wordTwo.length() + " characters in it");
      System.out.println ("Word three has " + wordThree.length() + " characters in it");
      
      




   }
   
}