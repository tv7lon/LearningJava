package DataTypes;

import javax.swing.*;

public class StoreAdmin{
   
   public static void main (String [] args){
   
      String CokeNumStr, BarOneNumStr, WaterNumStr;
      
      CokeNumStr = JOptionPane.showInputDialog ("How many Coca-Cola cans?");
      BarOneNumStr = JOptionPane.showInputDialog ("How many bar ones");
      WaterNumStr = JOptionPane.showInputDialog ("How many water bottles");
      
      double CokeNumInt = Double.parseDouble (CokeNumStr);
      double BarOneNumInt = Double.parseDouble (BarOneNumStr);
      double WaterNumInt = Double.parseDouble (WaterNumStr);
      
      double CokePrice = CokeNumInt * 13.9;
      double BarOnePrice = BarOneNumInt * 12;
      double WaterPrice = WaterNumInt * 9.50;
      
      double totalCost = CokePrice + BarOnePrice + WaterPrice;
      
      System.out.println ("Your total is R " + totalCost);
   }


}