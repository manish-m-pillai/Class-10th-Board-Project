import java.io.*;//calling package io.*
public class Pension_Rule
{
    public static void main(String[]args)throws IOException//main function
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int age;
        char gender;
        char ch='y';
        System.out.println("************/PENSION RULE/************");
        while((ch=='y'||ch=='Y'))//if user wants to continue pension rule
        {
            while(true)/*while loop to re-initialize the gender if wrong input is given by the user*/
            {
                System.out.println();
                System.out.println("Enter the Gender");
                System.out.println("'M' for male and 'F' for female");/*case sensitive*/
                gender=br.readLine().charAt(0);
                if((gender!='M')&&(gender!='F'))//if user has inputted wrong
                {
                    System.out.println();
                    System.out.println("You have entered a Wrong Word");
                    System.out.println("Please Re-Initialize Again!!");
                    System.out.println();
                }
                else//if user has inputted correct
                {
                    break;
                }
            }
            System.out.println();
            System.out.println("Enter the Name");
            String name=br.readLine();
            System.out.println();
            System.out.println("Enter the Age");
            age=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.println("Name => "+name);
            System.out.println("Age => "+age);
            if(gender=='M')//if gender is male
            {
                if((age>65)&&(age<=70))
                {
                    System.out.println("The Pension He gets per Week => Rs.100");
                }
                else if(age>70)
                {
                    System.out.println("The Pension He gets per Week => Rs.150");
                }
                else
                {
                    System.out.println("He is not Eligible for Getting a Pension");
                }
            }
            else//if gender is female
            {
                if((age>60)&&(age<=65))
                {
                    System.out.println("The Pension She gets per Week => Rs.80");
                }
                else if(age>65)
                {
                    System.out.println("The Pension She gets per Week => Rs.120");
                }
                else
                {
                    System.out.println("She is not Eligible for Getting a Pension");
                }
            }
            System.out.println();
            System.out.println("Do You Want To Run Pension Rule Again ?");
            System.out.println("Press 'y' or 'Y' to Run The Pension Rule Again");
            System.out.println("Or press any other Key to Exit");
            ch=br.readLine().charAt(0);
            System.out.println();
        }
        
        System.out.println("THANK YOU FOR USING PENSION RULE");
        }       
    }