package DataTypes;

import javax.swing.*;

public class pricesExercise{
   
   public static void main(String [] args){
   
   String productOneStr, productTwoStr, productThreeStr, priceOneStr, priceTwoStr, priceThreeStr;
   
   productOneStr = JOptionPane.showInputDialog ("Please enter your first product");
   productTwoStr = JOptionPane.showInputDialog ("Please enter your second product");
   productThreeStr = JOptionPane.showInputDialog ("Please enter your third product");
   
   
   priceOneStr = JOptionPane.showInputDialog ("Enter price of your first product");
   priceTwoStr = JOptionPane.showInputDialog ("Enter price of your second product");
   priceThreeStr = JOptionPane.showInputDialog ("Enter price of your third product");
  
   double priceOneDbb = Double.parseDouble (priceOneStr);
   double priceTwoDbb = Double.parseDouble (priceTwoStr);
   double priceThreeDbb = Double.parseDouble (priceThreeStr);
   
   System.out.println ("Your shopping list");
   System.out.println (productOneStr + " " + priceOneDbb);
   System.out.println (productTwoStr + " " + priceOneDbb);
   System.out.println (productThreeStr +  " " + priceOneDbb);
   
  
  
   }

}
