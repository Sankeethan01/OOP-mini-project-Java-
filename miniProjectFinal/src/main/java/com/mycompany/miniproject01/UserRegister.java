/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject01;

/*
 *
 * @author sanke
 */


import java.io.File;//import file class
import java.util.Scanner;//import scanner class
import java.io.FileWriter;//import filewriter class
import java.io.IOException;//import ioexception class for handling errors

public class UserRegister//create class UserRegister
{
    private String Email,FName,LName,password,phone01,Nic,username;
    public static void msg8() {
        UserRegister Booking_=new UserRegister();
        Scanner option2=new Scanner(System.in);
        String v;

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
        System.out.println("======================================");
        System.out.println("\t\tRegister As User");
        System.out.println("=======================================");
        //get input for register
        System.out.println("Enter the Email : ");
        Booking_.Email=option2.nextLine();

        System.out.println("Enter your NIC Number :");
        Booking_.Nic=option2.nextLine();

        System.out.println("Enter the FirstName : ");
        Booking_.FName=option2.nextLine();

        System.out.println("Enter the LastName : ");
        Booking_.LName=option2.nextLine();

        System.out.println("Enter the Phone Number : ");
        Booking_.phone01=option2.nextLine();

        //generating a username and a password for the user
        Booking_.password=Booking_.LName+Booking_.Nic.charAt(2)+Booking_.Nic.charAt(8)+Booking_.phone01.charAt(4)+Booking_.phone01.charAt(6);
        Booking_.username="ans"+Booking_.FName;
       //import register details to a file
        try
        {
            File myFile=new File(Booking_.username+Booking_.password+".txt");
            //checking whether user already registered or not
            if(myFile.exists()){
                System.out.println("Already registered as user.");
                System.out.println("Any queries please contact Admin.");
            }
            else
            //if new registered one then write information to file
            {
                FileWriter myRegister=new FileWriter(Booking_.username+Booking_.password+".txt");
                myRegister.write("\n\n==============ANS AUTOMOBILES==============");
                myRegister.write("\n                                          ");
                myRegister.write("\nUserName \t  :   \t"+Booking_.username);
                myRegister.write("\nPassword \t  : \t"+Booking_.password);
                myRegister.write("\nEmail \t\t  : \t"+Booking_.Email);
                myRegister.write("\n                                          ");
                myRegister.write("\n\n============================================");
                myRegister.close();
                //print the information to user
                System.out.println("\n");
                System.out.println("==============ANS AUTOMOBILES==============");
                System.out.println("                                           ");
                System.out.println("UserName \t  :   \t"+Booking_.username);
                System.out.println("Password \t  : \t"+Booking_.password);
                System.out.println("Email \t\t  : \t"+Booking_.Email);
                System.out.println("\n============================================");

                System.out.println("\nRegistration Successfull...\n\n");


                System.out.println("Do you want to continue (y/n)");
                v=option2.nextLine();

                switch (v)
                {
                    case "y","Y"->User.msg7();
                    case "n","N"->Exit.msg6();
                    default -> System.out.println("An error occured.");
                }


            }

        }
        catch (IOException e)
        {
            System.out.println("An error occured while saving.");
            System.out.println("Contact Admin.");
            e.printStackTrace();
        }





    }

}
