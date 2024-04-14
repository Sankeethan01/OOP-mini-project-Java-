/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject01;

/*
 *
 * @author sanke
 */
import java.util.Scanner;

public class Main //create the Main class
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String choose;
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
        System.out.println("\n01.Admin\n02.User\n03.Exit");

        System.out.println("\nYou want to login as Admin Input 01 Login as User Input 02 : ");//get input to choose an option
        choose = scan.nextLine();

        switch (choose) {
            case "01", "1" -> Admin.msg();//go to admin login section
            case "02", "2" ->User.msg7();//go to user section
            case "03", "3" -> Exit.msg6();//exit
            default -> {
                System.out.println("Invalid Input");
                GoMain.msg5();//go again main menu
            }

        }

    }
}

