import java.io.*;//calling package io.*
public class Hotel
{
public static void main(String[]args)throws IOException//main function
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    double discount;
    double amount=0;
    double d=0;
    double a=0;
    String name,room;
    String rc="";
    System.out.println("************/WELCOME TO THE HOTEL/************");
    System.out.println();
    System.out.println("Enter the name of the Guest");
    name=br.readLine();
    System.out.println();
    while(true)//while loop if user enters the wrong category
    {
    System.out.println("Enter the Category of Room");
    System.out.println("'S' for Semi-Deluxe Room");//case sensitive
    System.out.println("'D' for Deluxe Room");//case sensitive
    System.out.println("'SD' for Super-Deluxe Room");//case sensitive
    room=br.readLine();
    if((room.equals("S"))||(room.equals("D"))||(room.equals("SD")))/*if user enters correct*/
    {
        break;
    }
    else//if user enters wrong
    {
        System.out.println();
        System.out.println("You have entered the wrong Word");
        System.out.println("Please Reinitialize it Again");
        System.out.println();
    }
    }
    System.out.println();
    System.out.println("Enter the Number of Days to be Stayed");
    int days=Integer.parseInt(br.readLine());
    if(room.equals("S"))//if category is Semi-Deluxe
    {
        a=2500;
        rc="Semi-Deluxe";
        if(days<=3)
        {
            d=10;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else if((days>3)&&(days<=5))
        {
            d=15;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else if((days>5)&&(days<=10))
        {
            d=20;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else
        {
            d=30;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
    }
    if(room.equals("D"))//if category is Deluxe
    {
        a=3500;
        rc="Deluxe";
        if(days<=3)
        {
            d=10;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else if((days>3)&&(days<=5))
        {
            d=15;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else if((days>5)&&(days<=10))
        {
            d=20;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else
        {
            d=30;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
    }
    if(room.equals("SD"))//if category is Super-Deluxe
    {
        a=5000;
        rc="Super-Deluxe";
        if(days<=3)
        {
            d=10;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else if((days>3)&&(days<=5))
        {
            d=15;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else if((days>5)&&(days<=10))
        {
            d=20;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
        else
        {
            d=30;
            discount=(a*days*d)/100;
            amount=(a*days)-discount;
        }
    }
    System.out.println();//Bill of the hotel
    System.out.println("*********************/BILL/*********************");
    System.out.println();
    System.out.println("NAME OF THE CUSTOMER => "+name);
    System.out.println("ROOM CATEGORY => "+rc);
    System.out.println("PRICE OF THIS ROOM => Rs."+a);
    System.out.println("NUMBER OF DAYS STAYED => "+days);
    System.out.println("TOTAL AMOUNT => Rs."+(a*days));
    System.out.println("DISCOUNT => "+d+"%");
    System.out.println("TOTAL AMOUNT TO BE PAID AFTER AVAILING DISCOUNT => Rs."+amount);
    System.out.println();
    System.out.println("*******/THANK YOU FOR STAYING VISIT AGAIN/*******");
}
}    