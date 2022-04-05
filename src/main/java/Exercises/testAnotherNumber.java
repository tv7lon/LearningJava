/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises;

/**
 *
 * @author dhiyas
 */
import javax.swing.*;

public class testAnotherNumber {

    public static void main(String[] args) {
        String inputStr;

        inputStr = JOptionPane.showInputDialog("enter a number");

        int inputInt = Integer.parseInt(inputStr);

        if (inputInt > 0) {

            System.out.println("This number is positive.");
        } else {

            System.out.println("Number is negative.");
        }

        if (inputInt % 2 == 0) {

            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        if (inputInt % 7 == 0) {
            System.out.println("Divisable by 7");
        } else {
            System.out.println("Not divisable by 7");
        }
    }
}
