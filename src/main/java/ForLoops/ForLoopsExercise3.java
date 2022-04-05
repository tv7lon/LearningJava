/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

/**
 *
 * @author dhiyas (deeznutzo)
 */
public class ForLoopsExercise3 {

    public static void main(String[] args) {

        for (int i = 12; i >= 1; i--) {

            int num = 3;
            num = num * i;
            System.out.println("This number is only divisable by 3: " + num);

            if (num % 5 == 0) {
                System.out.println("This number is visable by 3 and 5: " + num);
            }

        }

    }

}
