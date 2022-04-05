/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises;

/**
 *
 * @author dhiyas
 */
import javax.swing.JOptionPane;

public class Discount {

    public static void main(String[] args) {

        String amountStr;

        amountStr = JOptionPane.showInputDialog("How much money did you spend XD");

        double amountDbb = Double.parseDouble(amountStr);

        if (amountDbb > 100) {
            double priceDbb = amountDbb - ((amountDbb / 100) * 10);
            System.out.println("You get a discount. Your price now is " + priceDbb);

        } else {
            System.out.println("Discounts only for payments above R100. Final price is R" + amountDbb);
        }

    }
}
