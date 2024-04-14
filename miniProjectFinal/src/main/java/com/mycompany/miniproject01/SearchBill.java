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
import java.io.FileNotFoundException;//import filenotfound exception
import java.util.Scanner;//import scanner class
public class SearchBill //create class SearchBill
{

    String[] Name01=new String[30];
    public static void msg11(){
        String choose78;
        Scanner scan=new Scanner(System.in);
        SearchBill search=new SearchBill();
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
        System.out.println("===================================================");
        System.out.println("\t\tFind the specific Booking");
        System.out.println("====================================================");
        System.out.println("\n\nEnter the name of the person  : ");//get input for searching
        search.Name01[20]=scan.nextLine();
       //if find that booking then print
        try {
            File myObj = new File(search.Name01[20] + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.\nThere is no booking by this name.");
            e.getStackTrace();
        }



        System.out.println("\n\nGo to Admin menu (Y/N) :");
        choose78=scan.nextLine();

        switch (choose78)
        {
            case "Y","y"->
                Adminmenu.msg1();

            default -> Exit.msg6();
        }

    }
}
