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
public class BookingAdmin //create class BookingAdmin
 {

    public static void msg2()//create void method for above class
    {

        Scanner adminbook=new Scanner(System.in);
        String option1,choosey2;

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
        System.out.println("================================================");
        System.out.println("\t\tBooking for Services");
        System.out.println("================================================\n");
        System.out.println("01.Go to Pre-Booking.");

        System.out.println("02.Remove the Booking..");
        System.out.println("03.Back to Admin Menu..\n");
        System.out.println("Enter an Option : ");
        option1=adminbook.nextLine();

        switch (option1) {
            case "1", "01" -> Services.msg3();

            case "2", "02" -> RemoveBooking.msg12();
            case "3", "03" -> Adminmenu.msg1();
            default -> {
                System.out.println("Invalid Input.");
                System.out.println("Do You Want to Continue(y/N) : ");
                choosey2 = adminbook.nextLine();
                switch (choosey2) {
                    case "y", "Y" -> BookingAdmin.msg2();
                    default -> Exit.msg6();
                }
            }
        }
    }
}
