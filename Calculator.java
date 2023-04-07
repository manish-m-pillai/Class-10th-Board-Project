/**
 * A Program of Calculator
 * Use of Scanner Class in this program
**/
import java.util.*;//calling package util.*
public class Calculator
{
    void Addition(int a,int b)//overloaded Addition function
    {
        int c=a+b;
        System.out.println("Result => "+c);
    }
    void Addition(float a,float b)//overloaded Addition function
    {
        float c=a+b;
        System.out.println("Result => "+c);
    }
    void Addition(int a,float b)//overloaded Addition function
    {
        float c=a+b;
        System.out.println("Result => "+c);
    }
    void Addition(float a,int b)//overloaded Addition function
    {
        float c=a+b;
        System.out.println("Result => "+c);
    }
    void Subtraction(int a,int b)//overloaded Subtraction function
    {
        int c=a-b;
        System.out.println("Result => "+c);
    }
    void Subtraction(float a,float b)//overloaded Subtraction function
    {
        float c=a-b;
        System.out.println("Result => "+c);
    }
    void Subtraction(int a,float b)//overloaded Subtraction function
    {
        float c=a-b;
        System.out.println("Result => "+c);
    }
    void Subtraction(float a,int b)//overloaded Subtraction function
    {
        float c=a-b;
        System.out.println("Result => "+c);
    }
    void Multiplication(int a,int b)//overloaded Multiplication function
    {
        int c=a*b;
        System.out.println("Result => "+c);
    }
    void Multiplication(float a,float b)//overloaded Multiplication function
    {
        float c=a*b;
        System.out.println("Result => "+c);
    }
    void Multiplication(int a,float b)//overloaded Multiplication function
    {
        float c=a*b;
        System.out.println("Result => "+c);
    }
    void Multiplication(float a,int b)//overloaded Multiplication function
    {
        float c=a*b;
        System.out.println("Result => "+c);
    }
    void Division(int a,int b)//overloaded Division function
    {
        float c=(float)a/(float)b;
        System.out.println("Result => "+c);
    }
    void Division(float a,float b)//overloaded Division function
    {
        float c=a/b;
        System.out.println("Result => "+c);
    }
    void Division(int a,float b)//overloaded Division function
    {
        float c=a/b;
        System.out.println("Result => "+c);
    }
    void Division(float a,int b)//overloaded Division function
    {
        float c=a/b;
        System.out.println("Result => "+c);
    }
    public static void main(String[]args)//main function
    {
        Scanner sc = new Scanner(System.in);
        Calculator ob = new Calculator();//declaring object of the class
        System.out.println("************/CALCULATOR/************");
        System.out.println();
        System.out.println("Press '+' for Addition");
        System.out.println("Press '-' for Subtraction");
        System.out.println("Press '*' for Multiplication");
        System.out.println("Press '/' for Division");
        System.out.println("Make your Choice");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+'://When user inputs '+'
            System.out.println("Enter the First Number");
            if(sc.hasNextInt())/*Checking whether the number is integer or not*/
            {
                int a=sc.nextInt();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Addition(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/ 
                {
                    float b=sc.nextFloat();
                    ob.Addition(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break; 
                }
            }
            else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
            {
                float a=sc.nextFloat();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Addition(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Addition(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break;
                }
            }
            else//if user has entered something else
            {
                System.out.println();
                System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                break;
            }
            break;
            case '-'://when user inputs '-'
            System.out.println("Enter the First Number");
            if(sc.hasNextInt())/*Checking whether the number is integer or not*/
            {
                int a=sc.nextInt();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Subtraction(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Subtraction(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break; 
                }
            }
            else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
            {
                float a=sc.nextFloat();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Subtraction(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Subtraction(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break;
                }
            }
            else//if user has entered something else
            {
                System.out.println();
                System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                break;
            }
            break;
            case '*'://when user inputs '*'
            System.out.println("Enter the First Number");
            if(sc.hasNextInt())/*Checking whether the number is integer or not*/
            {
                int a=sc.nextInt();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Multiplication(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Multiplication(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break; 
                }
            }
            else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
            {
                float a=sc.nextFloat();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Multiplication(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Multiplication(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break;
                }
            }
            else//if user has entered something else
            {
                System.out.println();
                System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                break;
            }
            break;
            case '/'://when user inputs '/'
            System.out.println("Enter the First Number");
            if(sc.hasNextInt())/*Checking whether the number is integer or not*/
            {
                int a=sc.nextInt();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Division(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Division(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break; 
                }
            }
            else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
            {
                float a=sc.nextFloat();
                System.out.println("Enter the Second Number");
                if(sc.hasNextInt())/*Checking whether the number is integer or not*/
                {
                    int b=sc.nextInt();
                    ob.Division(a,b);//calling function
                }
                else if(sc.hasNextFloat())/*Checking whether the number is floating type or not*/
                {
                    float b=sc.nextFloat();
                    ob.Division(a,b);//calling function
                }
                else//if user has entered something else
                {
                    System.out.println();
                    System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                    System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                    break;
                }
            }
            else//if user has entered something else
            {
                System.out.println();
                System.out.println("ERROR! YOU HAVE ENTERED SOMETHING WRONG");
                System.out.println("RE-EXECUTE THE PROGRAM AGAIN!");
                break;
            }
            break;
            default://if user has inputted a wrong choice
            System.out.println("INVALID CHOICE");
        }
    }
}