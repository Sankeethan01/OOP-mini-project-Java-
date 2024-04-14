/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject01;

/*
 *
 * @author sanke
 */



import java.io.FileWriter;//import filewriter class
import java.io.IOException;//import ioexception class
import java.time.LocalDate;//import local date class
import java.util.Scanner;//import scanner
public class Booking //create Booking class
{
    String Date,NIC,Phone,Email;//defining string variables
 //defining some string arrays
    String[] Name=new String[30];
     String[] Address=new String[50];
     String[] Car_Detail=new String[30];
    private int i;//define integer variable
    float[] Charge=new float[]{0,1500,2500,3000,4000,80000,35000,20000,15000,5000,5000,5000,7000,5000,4500,8000,8000,
                               9000,25000,30000,15000,40000,4000,3000,4000,4000,5000,4000,2000,15000,35000,25000,35000,
                                25000,35000,15000,20000,45000,65000,65000,50000,15000,10000,25000,30000,15000,25000,25000,25000,
                             25000,25000,3000,115000,10000,30000,20000,15000,100000,150000,35000,85000,200000,160000,85000,25000,
                          4500,5000,15000,25000,850000,950000,900000,700000,600000,500000,900000,550000,850000,900000,700000,950000,
                            1000000,900000,800000,1200000,1000000,900000,700000,800000,850000};//define all charge values to float array
   //define some other variables
    float discount=0;
    float sum=0;
    float subTotal=0;
    int[] chargeName = new int[]{0, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,
                                32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,
                               62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,};//define all numbers of service
    int[] num=new int[10];

    String[] Service = {"","Basic wash",
                         "Deluxe wash" ,
                            "Premium wash","Ultimate wash","ANS Total care","Full Inspection ",
                            "Full Service","Lube Service","Exterior Detail","Interior Detail","Masking",
                             "Wheel Alignment","Rubber Treatment","Car tint sun control films","Filter Replacement"
                              ,"Rust proofing undercoating","Oil Change","Auto transmission Fluid Change","Decarbonizing"
                             ,"DPF setup","Complete Engine Overhaul","Cleaning and Waxing","Headlight Restoration",
                       "Electronic Injector Cleaning","Injector Cleaning","Engine Cleaning & Glazing","Glass Polish",
                         "Car Wrapping","Brake Repairs","ABS Repairs","Suspension Repairs","Engine Overhauls Repairs",
                    "A/C Repairs","Electrical Repairs","ESC Repairs","Steering Repairs","2WD Drive Shaft Repairs",
               "4WD Drive Shaft Repairs","Auto Transmission Repairs","Manual Transmission Repairs","Ignition Repairs",
                "ECU Repairs","Heating Systems Repairs","Climate Control Systems Repairs","Disk Facing Repairs",
               "Engine Scanning","EFI Engine Tune up","Common Rail Engine Tune up(Diesel)","Common Rail Engine Tune up(Patrol)",
               "Emission Control","Timing Correction","Audio Surrounding Correction","Remote & sensing Checkup","DVR store",
              "Park Assist Store","Nanoe Bootup","Visual Screens Setup","Air Bags Store","Cruise Control Setup","Safety Package Setup",
              "Memory Seat Setup Control","Seat Heating Setup","LED Upgrade","GPS Navigation Bootup","Cut & Polish","Paint Protecting Film",
              "Full Scratch Scanning","Scratch Removing","Full Body Painting(Sedan)","Full Body Painting(Van)","Full Body Painting(SUV)",
              "Full Body Painting(MiniVan)","Full Body Painting(MPV)","Full Body Painting(Micro)","Full Body Painting(Convertible)",
               "Full Body Painting(Wagon)","Full Body Painting(Hatchback)","Full Body Painting(Coupe)","Full Body Painting(Antique)",
               "Full Body Painting(Muscle car)","Full Body Painting(Limousine)","Full Body Painting(Pickup)","Full Body Painting(Roadster)",
               "Full Body Painting(Supercars)","Full Body Painting(Campervan)","Full Body Painting(Cabriolet)","Full Body Painting(Mini Truck)",
                "Full Body Painting(Truck)","Full Body Painting(Big Truck)"};//define all services to a string array

    public static void msg4()//create void method for booking
    {
        LocalDate date=LocalDate.now();
       String Tp;

        Booking Booking_=new Booking();//creating Booking object_ from Booking class
        Scanner option2=new Scanner(System.in);

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
        System.out.println("=============================");
        System.out.println("\t\tBooking Section");
        System.out.println("==============================\n");
//get input for booking
        System.out.println("\nEnter the Name : ");
        Booking_.Name[20]=option2.nextLine();

        System.out.println("Enter the Date for Services : ");
        Booking_.Date=option2.nextLine();

        System.out.println("Enter the NIC Number : ");
        Booking_.NIC=option2.nextLine();

        System.out.println("Enter the Phone Number : ");
        Booking_.Phone=option2.nextLine();

        System.out.println("Enter the Address : ");
        Booking_.Address[30]=option2.nextLine();

        System.out.println("Enter the Car Details : ");
        Booking_.Car_Detail[20]=option2.nextLine();

        System.out.println("Enter the Email : ");
        Booking_.Email=option2.nextLine();


        System.out.println("How many Services : ");//get input how many services
        Booking_.i=option2.nextInt();


        for(int p=0;p<Booking_.i;p++)
        {
            System.out.println("Number of the Service :");//get the number of service and store in an array
            Booking_.num[p]=option2.nextInt();
        }


       //print output for the bill
        System.out.println("\n==========Bill for the Booking==============\n\n");
        System.out.println("------------ANS AUTOMOBILES PVT LTD-------------");
        System.out.println("------------------------------------------------");
        System.out.print("Bill no : 2550");

        System.out.println("\t\tDate : "+date);

        System.out.println("------------------------------------------------");
        System.out.println("Name \t\t  : \t\t"+Booking_.Name[20]);
        System.out.println("Date \t\t  : \t\t"+Booking_.Date);
        System.out.println("NIC Number \t  : \t\t"+Booking_.NIC);
        System.out.println("Phone Number  :  \t\t"+Booking_.Phone);
        System.out.println("Address\t \t  : \t\t"+Booking_.Address[30]);
        System.out.println("Car Details\t  : \t\t"+Booking_.Car_Detail[20]);
        System.out.println("Email \t\t  : \t\t"+Booking_.Email);
        System.out.println("------------------------------------------------");
        System.out.println("Service\t\t\t\t\tCharge");
        System.out.println("------------------------------------------------");

        for(int i=0;i<Booking_.i;i++){
            System.out.println(Booking_.Service[Booking_.chargeName[Booking_.num[i]]]);//find the service name by the number
            System.out.println("\n\t\t\t\t   \t\t"+Booking_.Charge[Booking_.chargeName[Booking_.num[i]]]);//find the service charge by the number
            Booking_.sum= Booking_.sum+Booking_.Charge[Booking_.chargeName[Booking_.num[i]]];//calculate sum of the charge
        }

        Booking_.subTotal= Booking_.sum;//define sum to subtotal
        //calculate discount
        if(Booking_.sum<10000)
        {
            Booking_.discount+=Booking_.sum*0.025;
        }
        else if(Booking_.sum>=10000 && Booking_.sum<20000)
        {
            Booking_.discount+=Booking_.sum*0.05;
        }
        else if(Booking_.sum>=20000 && Booking_.sum<30000)
        {
            Booking_.discount+=Booking_.sum*0.075;
        }
        else if(Booking_.sum>=30000 && Booking_.sum<50000)
        {
            Booking_.discount+=Booking_.sum*0.1;
        }
        else
        {
            Booking_.discount+=Booking_.sum*0.15;
        }

        Booking_.sum-=Booking_.discount;//calculate final sum by substract discount

        System.out.println("\n\t\t\t\t\t------------------------");
        System.out.println("SubTotal\t\t\t\t"+Booking_.subTotal);
        System.out.println("Discount\t\t\t\t"+Booking_.discount);
        System.out.println("\nTotal\t\t\t\t\t"+Booking_.sum);
        System.out.println("\n------------------------------------------------");


        System.out.println("\n\nA copy of Bill has been emailed...\n");

        //write bill to file
        try {
              FileWriter myWriter = new FileWriter(Booking_.Name[20]+ ".txt");//create file
                myWriter.write("\n------------ANS AUTOMOBILES PVT LTD-------------");
                myWriter.write("\n------------------------------------------------");
                myWriter.write("\nBill no : 2550");
                myWriter.write("\t\tDate : " + date);

                myWriter.write("\n------------------------------------------------");
                myWriter.write("\nName \t\t  : \t\t" + Booking_.Name[20]);
                myWriter.write("\nDate \t\t  : \t\t" + Booking_.Date);
                myWriter.write("\nNIC Number \t  : \t\t" + Booking_.NIC);
                myWriter.write("\nPhone Number  :  \t\t" + Booking_.Phone);
                myWriter.write("\nAddress\t \t  : \t\t" + Booking_.Address[30]);
                myWriter.write("\nCar Details\t  : \t\t" + Booking_.Car_Detail[20]);
                myWriter.write("\nEmail \t\t  : \t\t" + Booking_.Email);
                myWriter.write("\n------------------------------------------------");
                myWriter.write("\n\nService\t\t\t\t\tCharge");
                myWriter.write("\n------------------------------------------------");

                for (int i = 0; i < Booking_.i; i++) {

                    myWriter.write("\n" + Booking_.Service[Booking_.chargeName[Booking_.num[i]]]);
                    myWriter.write("\n\t\t\t\t   \t\t" + Booking_.Charge[Booking_.chargeName[Booking_.num[i]]] + "\n");
                }
                myWriter.write("\n\n\t\t\t\t\t-----------------------");
                myWriter.write("\nSubTotal\t\t\t\t" + Booking_.subTotal);
                myWriter.write("\nDiscount\t\t\t\t" + Booking_.discount);
                myWriter.write("\nTotal\t\t\t\t\t" + Booking_.sum);
                myWriter.write("\n------------------------------------------------\n");
                myWriter.close();//close the file



            }
        catch(IOException e)//error find exception
        {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        System.out.println("Do You Want to Exit (Y/N) : ");
        Tp=option2.next();
        switch (Tp) {
            case "y", "Y" -> Exit.msg6();
            case "n", "N" -> GoMain.msg5();//go to main interface
            default -> System.out.println("An error occured.");
        }

    }
}
