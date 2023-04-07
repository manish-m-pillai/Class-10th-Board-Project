import java.io.*;//calling package io.*
public class Overload_Series
{
    double series(double n)/*overloaded function with single parameter*/
    {
       double sum=0;
       int i,j,f;
       for(i=1;i<=n;i++)
       {
           f=1;
           for(j=1;j<=i;j++)
           {    
               f=f*j;
            }
           sum=sum+(double)1/f;
        }
        return sum;
    }
    double series(double a,double n)/*overloaded function with double parameters*/
    {
        double sum=0;
        int i,f=2;
        for(i=1;i<=n;i++)
        {
            sum=sum+1/(Math.pow(a,f));
            f=f+3;
        }
        return sum;
    }
    public static void main(String[]args)throws IOException/*main function*/
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        Overload_Series ob = new Overload_Series();/*declaring object of the class*/
        System.out.println("Enter the value of n");
        double n=Double.parseDouble(br.readLine());
        System.out.println("Enter the value of a");
        double a=Double.parseDouble(br.readLine());
        double series1=ob.series(n);//calling overloaded function
        double series2=ob.series(a,n);//calling overloaded function
        System.out.println("The Sum of the Series 1 = " +series1);
        System.out.println("The Sum of the Series 2 = " +series2);
    }
}