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
public class Admin //create Admin class
{
    public static void msg() {
        Scanner adminsc = new Scanner(System.in);
        final String username = "admin";
         final String password = "1234";//defining a username and password for admin
          String Username, Password;

          System.out.println("\n\nLogin As Admin\n");

        System.out.println("Username :");
          Username=adminsc.nextLine();

          if(Username.equals(username))//username checking

    {
        System.out.println("Password :");
        Password = adminsc.nextLine();
        if (Password.equals(password)) //password checking
        {
            Adminmenu.msg1();
        } else {
            System.out.println("Please check your password."); //password error
            Admin.msg();
        }
    }
        else

    {
        System.out.println("Check your username..");//username error
        Admin.msg();
    }

}
}

