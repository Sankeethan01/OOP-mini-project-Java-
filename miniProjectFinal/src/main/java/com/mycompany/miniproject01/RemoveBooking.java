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
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
public class RemoveBooking //create RemoveBooking class
{
    String[] Name01=new String[30];
    public static void msg12()//void method for RemoveBooking class
    {
        String choose78,choose79;
        Scanner scan=new Scanner(System.in);
        RemoveBooking remove=new RemoveBooking();

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
        System.out.println("##################################################################\n\n");

        System.out.println("========================================");
        System.out.println("\t\tRemove the Booking");
        System.out.println("=========================================");
        System.out.println("\n\nEnter the name of the person to delete the Booking : ");//get name for delete the booking

        remove.Name01[20]=scan.nextLine();
     //first print the bill of that name
        try {
            File myObj = new File(remove.Name01[20] + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
            myReader.close();

            System.out.println("Do You Want to remove this Booking (Y/N) : ");//get input delete or not
            choose78=scan.nextLine();

            switch (choose78) {
                case "y", "Y" -> {
                    File myObj1 = new File(remove.Name01[20] + ".txt");//delete the file
                    if (myObj1.delete()) {
                        System.out.println("Deleted the booking: " + myObj1.getName());//if deleted successfull print this
                        BookingAdmin.msg2();
                    } else {
                        System.out.println("Failed to delete the booking.");//deleting error occures print this
                        System.out.println("\n\nDo you want to continue (Y/N) :");
                        choose79=scan.nextLine();

                        switch (choose79)
                        {
                            case "y","Y"->

                                    BookingAdmin.msg2();//go to menu

                            case "n","N"->

                                    Exit.msg6();

                            default -> Adminmenu.msg1();//go to menu

                        }
                    }
                }
                case "n","N"->
                        BookingAdmin.msg2();//go to menu

                default -> Adminmenu.msg1();//go to menu
            }


        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.\nThere is no Booking with this name.");//file not found exception
            e.getStackTrace();
            Adminmenu.msg1();
        }



    }
}
