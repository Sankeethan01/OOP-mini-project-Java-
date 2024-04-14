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

public class User//create class User
{
    public static void msg7() {

        Scanner scans=new Scanner(System.in);
        String option3,choosey4;

        System.out.println("\n\n");
        System.out.println("##################################################################");
        System.out.println("##################################################################");
        System.out.println("##  * * * * * * * *     * *           * *     * * * * * * * *   ##");
        System.out.println("##  * * * * * * * *     * * *         * *     * *         * *   ##");
        System.out.println("##  * *         * *     * * * *       * *     * *               ##");
        System.out.println("##  * *         * *     * *   * *     * *     * * * * * * * *   ##");
        System.out.println("##  * * * * * * * *     * *     * *   * *     * * * * * * * *   ##");
        System.out.println("##  * *         * *     * *       * * * *                 * *   ##");
        System.out.println("##  * *         * *     * *         * * *     * *         * *   ##");
        System.out.println("##  * *         * *     * *           * *     * * * * * * * *   ##");
        System.out.println("##################################################################");
        System.out.println("##################################################################");
        System.out.println("\n\n");
        System.out.println("==================================");
        System.out.println("\t\tUSER SECTION");
        System.out.println("===================================\n");
        System.out.println("01.Login");
        System.out.println("02.Register.");
        System.out.println("03.Exit.");
        System.out.println("Enter an Option : ");
        option3=scans.nextLine();

        switch (option3) {
            case "1", "01" -> UserLogin.msg9();
            case "2", "02" -> UserRegister.msg8();
            case "3", "03" -> Exit.msg6();
            default -> {
                System.out.println("Invalid Input.");
                System.out.println("Do You Want to Continue(y/N) : ");
                choosey4 = scans.nextLine();
                switch (choosey4) {
                    case "y", "Y" -> User.msg7();
                    case "n", "N" -> Exit.msg6();
                }
            }
        }
    }
}
