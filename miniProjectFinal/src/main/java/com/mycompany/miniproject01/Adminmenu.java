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

public class Adminmenu //create Adminmenu class
{


    public static void msg1() {
        Scanner chooseA=new Scanner(System.in);
        String chooseadmin;
        String choosey1;

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

        System.out.println("\n\nWelcome Admin\n");
        //options for admin
        System.out.println("===================================");
        System.out.println("\t\tADMIN SECTION");
        System.out.println("====================================\n");
        System.out.println("01.Booking or Billing for Services.");
        System.out.println("02.Search the Bills With Name.");
        System.out.println("03.Customer Care.");
        System.out.println("04.Exit.\n");

        System.out.println("Choose an Option : ");//choosing an option
        chooseadmin=chooseA.nextLine();
        switch (chooseadmin) {
            case "1", "01" -> BookingAdmin.msg2();//go to booking by admin section
            case "2", "02" -> SearchBill.msg11();//go to searching bill with name
            case "3", "03" -> CustomerCare.msg10();//go to customer care support
            case "04", "4" -> Exit.msg6();//go to exit
            default -> {
                System.out.println("Invalid Input.");
                System.out.println("Do You Want to Continue(y/N) : ");
                choosey1 = chooseA.nextLine();
                switch (choosey1) {
                    case "y", "Y" -> Adminmenu.msg1();//go again admin menu
                    case "n", "N" -> Exit.msg6();
                    default -> Admin.msg();//go to admin login
                }
            }
        }

    }
}
