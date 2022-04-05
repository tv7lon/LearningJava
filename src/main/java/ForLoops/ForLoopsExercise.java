/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

/**
 *
 * @author dhiyas
 */
public class ForLoopsExercise {

    public static void main(String[] args) {

        int total = 0;

        //7 times table, get sum
        for (int i = 1; i <= 12; i = i + 1) {
            int num = 7;
            num = num * i;
            System.out.println(num + ",");
            total = total + num;
        }

        System.out.println("Total is " + total);
    }

}
