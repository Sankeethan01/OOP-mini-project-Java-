/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject01;

/*
 *
 * @author sanke
 */
import java.util.Scanner;
public class GoMain {

    public static void msg5() {
        Scanner in = new Scanner(System.in);
        String Cont;
        System.out.println("Do you want to exit or continue(Y/N) :");
        Cont = in.nextLine();

        switch (Cont) {
            case "Y", "y" -> Main.main(null);
            default ->
                Exit.msg6();

        }
    }
}
