/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

/**
 *
 * @author dhiyas
 */


import javax.swing.JOptionPane;


public class RepeatName {
    
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog("What is your name?");
        String loopNum = JOptionPane.showInputDialog("How many times do you want to print a name?");
        
        int loopInt = Integer.parseInt(loopNum);
                
        
        for (int i = 0; i < loopInt; i++) {
            System.out.println (in);
        }
    }
    
    
}
