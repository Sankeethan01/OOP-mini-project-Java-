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
import java.io.File;


public class UserLogin //create class UserLogin
{

    public static void msg9() {

        String Username, Password;
        Scanner usersc=new Scanner(System.in);
        //define a loop for input 4 times only username and password
        for(int a=0;a<4;a++) {
        System.out.println("Username : ");
        Username=usersc.nextLine();

        System.out.println("Password : ");
        Password=usersc.nextLine();
        //check whether user already registered or not
        File myReader=new File(Username+Password+".txt");
          //if already registered then allow to go user section
        if (myReader.exists()) {

                System.out.println("\n\nWelcome User\n");
                UserMenu.msg15();


            }
        //if not try again only three times
        else {
                System.out.println("Check your Username or Password.");

            }
        }

        System.out.println("\nSorry,Time out.");
        User.msg7();


    }
}
