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


public class CustomerCare //create class CustomerCare
{
    String Email;
    String PhoneNo;
    String[] Note=new String[150];
    public static void msg10()//create void method for above class
    {
        CustomerCare Customer=new CustomerCare();
        String bbb;
        Scanner sd=new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("\t\tCustomer Care");
        System.out.println("=======================================\n");

      //get input customer details
        System.out.println("Customer Email: ");
        Customer.Email=sd.nextLine();
        System.out.println("Customer Mobile Number: ");
        Customer.PhoneNo=sd.nextLine();
        System.out.println("Messege: ");
        Customer.Note[100]=sd.nextLine();

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
        //output messege
        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("Email\t: "+Customer.Email);
        System.out.println("PhoneNo\t: "+Customer.PhoneNo);

        System.out.println("Dear Customer,");
        System.out.println(Customer.Note[100]);
        System.out.println("==============================================\n\n");
        System.out.println("A copy of This Messege has been emailed.");
        System.out.println("A copy of This Messege has been sent.");
        System.out.println("Back to menu: ");
        bbb=sd.nextLine();
        switch (bbb)
        {
            case "y","Y"->Adminmenu.msg1();
            default -> Exit.msg6();
        }



    }
}
