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

public class LargerOfTwo {

    public static void main(String[] args) {

        String inputOneStr, inputTwoStr;

        inputOneStr = JOptionPane.showInputDialog("enter 1st number");
        inputTwoStr = JOptionPane.showInputDialog("enter 2nd number");

        int inputOneInt = Integer.parseInt(inputOneStr);
        int inputTwoInt = Integer.parseInt(inputTwoStr);

        if (inputOneInt > inputTwoInt) {
            System.out.println("Number one (" + inputOneInt + ") is bigger than number 2.");
        } else if (inputTwoInt > inputOneInt) {
            System.out.println("Number 2 (" + inputTwoInt + ") is bigger than number 1 (" + inputOneInt + ").");

        } else {
            System.out.println("Number 1 (" + inputOneInt + ") is equal to number 2. (" + inputTwoInt + ")");

        }
    }
}
