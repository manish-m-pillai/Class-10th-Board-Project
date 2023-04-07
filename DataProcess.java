import java.io.*;//importing package io.*
class DataProcess
{
    private int N;//declaring an instance variable
    private char ch;//declaring an instance variable
    DataProcess(long x,char st)//parameterized constructor
    {
        N=(int)x;
        ch=st;
    }
    long FindProduct()/*function to return the product of even numbers present in N*/
    {
        char c;
        int i=0;
        long product=1;
        long even;
        String s=Integer.toString(N);
        do//Using do while loop to extract digits without using %
        {
            c=s.charAt(i);
            if((c=='2')||(c=='4')||(c=='6')||(c=='8'))
            {
                even=(long)c-48;
                product=product*even;
            }
            i++;
        }
        while(i<s.length());
        if(product>1)//if condition to check that product is greater than 1
        {
            return product;
        }
        else//else condition if there is no even number present in variable N
        {
            product=0;
            return product;
        }
    }
    void change()//function to convert the case of the letter present in ch
    {
        char cha;
        if(Character.isLowerCase(ch))
        {
            cha=Character.toUpperCase(ch);
        }
        else
        {
            cha=Character.toLowerCase(ch);
        }
        System.out.println("Original Character = "+ch);
        System.out.println("The New Character after changing the Case  = "+cha);
        }
public static void main(String [] args)throws IOException//Main Function
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    char chara;
    System.out.println("Enter the Number of long type");
    long num=Long.parseLong(br.readLine());
    System.out.println();
    while(true)/*while loop to check whether the user enters the correct value or not*/
    {
    System.out.println("Enter the Alphabet");
    chara=br.readLine().charAt(0);//to accept a character
    if(Character.isLetter(chara)==false)/*To check whether the User has enteredthe wrong character*/
    {
        System.out.println();
        System.out.println("You have Entered the Wrong Character");
        System.out.println("Please Reinitialize it Again");
        System.out.println();
    }
    else
    {
        break;
    }
    }
    DataProcess ob = new DataProcess(num,chara);//declaring object of the class
    long l=ob.FindProduct();//calling function
    System.out.println();
    System.out.println("Product = "+l);
    System.out.println();
    ob.change();//calling function
}
}
    
     


