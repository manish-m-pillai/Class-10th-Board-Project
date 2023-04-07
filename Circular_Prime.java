import java.io.*;//calling package io.*
public class Circular_Prime
{
    public static void main(String[]args)throws IOException//main function
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the Number");
        int num=Integer.parseInt(br.readLine());
        int temp=num;
        String st=Integer.toString(num);
        String str;
        int L=st.length();
        char ch;
        int i,c;
        int p=0;
        int f=1;
        while(f<=L)//while loop when f is less than length of the String st
        {
            str=st;
            st="";
            c=0;
            for(i=1;i<=num;i++)/*logic to check whether the number is prime or not*/
            {
                if(num%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                p++;
            }
            else
            {
                break;
            }
            for(i=1;i<L;i++)
            {
                ch=str.charAt(i);
                st=st+ch;
            }
            st=st+str.charAt(0);
            num=Integer.parseInt(st);
            str="";
            f++;
        }
        if(p==L)
        {
            System.out.println(temp+" is a Circular Prime Number");
        }
        else
        {
            System.out.println(temp+" is not a Circular Prime Number");
        }
    }
}