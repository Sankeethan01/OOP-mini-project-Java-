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
public class UserMenu //create class UserMenu
{
    public static void msg15() {
        Scanner scan=new Scanner(System.in);
        String select;
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
        System.out.println("\n");
        System.out.println("Welcome User.\n");
        System.out.println("==============================");
        System.out.println("\t\tUser Menu");
        System.out.println("==============================");

        System.out.println("\n\n01.Pre-Book for Services.");
        System.out.println("02.Exit.");

        System.out.println("Select an option : ");
        select=scan.nextLine();

        switch (select)
        {
            case "1","01"->
                UserServices.msg16();

            case  "2","02"->
                Exit.msg6();
            default -> User.msg7();
        }
    }
}
