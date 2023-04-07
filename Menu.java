import java.io.*;//calling package io.*
public class Menu
{
    public static void main(String[]args)throws IOException/*main function*/
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the Number");
        int num=Integer.parseInt(br.readLine());
        System.out.println("************MENU************");
        System.out.println("Press 1 for Duck Number");
        System.out.println("Press 2 for Multiple Harshad Number");
        System.out.println("Make your Choice");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1://if user has entered 1 i.e. Duck Number
            int i;
            int d=0;
            String st;
            char c;
            st=Integer.toString(num);
            for(i=0;i<st.length();i++)
            {
                c=st.charAt(i);
                if(c=='0')
                {
                    d=1;
                    break;
                }
            }
            if(st.charAt(0)=='0')
            {
                d=0;
            }
            if(d==1)
            {
                System.out.println("It is a Duck Number");
            }
            else
            {
                System.out.println("It is not a Duck Number");
            }
            break;
            case 2://If user has entered 2 i.e. Multiple Harshad Number
            int sum=0;
            int temp,r,n;
            int h=0;
            n=num;
            temp=num;
            while(num>=10)
            {
                n=num;
                sum=0;
                while(num!=0)
                {
                    r=num%10;
                    sum=sum+r;
                    num=num/10;
                }
                if(n%sum==0)
                {
                    h++;
                    num=n/sum;
                }
            }
            if(h>=2)
            {
                System.out.println(temp+" is a Multiple Harshad Number");
            }
            else
            {
                System.out.println(temp+" is not a Multiple Harshad Number");
            }
            break;
            default://if user has entered wrong input
            System.out.println("INVALID CHOICE");
        } 
    }
}