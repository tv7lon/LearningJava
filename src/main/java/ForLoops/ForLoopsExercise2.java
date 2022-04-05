/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author dhiyas
 */
public class ForLoopsExercise2 {

    //mmmmmmmmmmmmmmmmmmmmm get 5 numbers and get 1) sum, 2) average, 3) highest
    public static void main(String[] args) {

        int total = 0;

        for (int i = 0; i < 5; i++) {

            String userNumStr = JOptionPane.showInputDialog("Enter a number.");

            int userNumInt = Integer.parseInt(userNumStr);
            total = total + userNumInt;

        }

        System.out.println("Total is " + total);
    }

}
