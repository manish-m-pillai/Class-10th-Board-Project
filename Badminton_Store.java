import java.io.*;//calling package io.*
public class Badminton_Store
{
    public static void main(String[]args)throws IOException//main function
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("************/BADMINTON STORE/************");
        System.out.println("Enter the Date of Purchase");
        String date=br.readLine();//to enter date
        System.out.println("Enter the Buyer Name");
        String name=br.readLine();//to enter the name
        System.out.println("Enter the Price of Badminton racket");
        double rs1=Double.parseDouble(br.readLine());/*to enter the price of Badminton Rackets*/
        System.out.println("Enter the Price of Shuttlecock Box Containing 10 Each");
        double rs2=Double.parseDouble(br.readLine());/*to enter the price of Shuttlecock Boxes*/
        System.out.println("Enter the Price of Net");
        double rs3=Double.parseDouble(br.readLine());/*to enter the price of Nets*/
        System.out.println("Enter the Quantity of Badiminton Racket purchased");
        int q1=Integer.parseInt(br.readLine());//quantity purchased by the buyer
        System.out.println("Enter the Quantity of Shuttlecock Box purchased");
        int q2=Integer.parseInt(br.readLine());//quantity purchased by the buyer
        System.out.println("Enter the Quantity of Net purchased");
        int q3=Integer.parseInt(br.readLine());//quantity purchased by the buyer
        double a1=rs1*q1;
        double a2=rs2*q2;
        double a3=rs3*q3;
        double amount=a1+a2+a3;//total amount
        double stamount=amount+((8*amount)/100);//total amount after tax
        System.out.println();//bill details
        System.out.println("**************************************/BADMINTON STORE/****************************************");
        System.out.println();
        System.out.println("                                       BILLING DETAILS");
        System.out.println("Date of Purchase => "+date);
        System.out.println("Name of the Buyer => "+name);
        System.out.println("S.No\t\tItem\t\t\tPrice\t\t\tQuantity\tAmount");
        System.out.println("1.\t\tBadminton Racket\tRs."+rs1+"\t\t"+q1+"\t\tRs."+a1);
        System.out.println("2.\t\tShuttle Cock Box\tRs."+rs2+"\t\t"+q2+"\t\tRs."+a2);
        System.out.println("3.\t\tNet\t\t\tRs."+rs3+"\t\t"+q3+"\t\tRs."+a3);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\tTotal Amount => Rs."+amount);
        System.out.println("\t\t\t\t\t\t\t\t   Sales Tax => 8%");
        System.out.println("\t\t\t\t     Total Amount to be Paid after Sales Tax => Rs."+stamount);
        System.out.println();
        System.out.println("*********************************/THANK YOU FOR SHOPPING VISIT AGAIN/***************************");
    }    
}