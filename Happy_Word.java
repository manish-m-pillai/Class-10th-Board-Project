import java.io.*;//calling package io.*
public class Happy_Word
{
    public static void main(String[]args)throws IOException//main function
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter a word");
        String st=br.readLine();
        st=st.toUpperCase();//if user has entered in small case
        String str="";
        char ch;
        int i,l,n,num,sum,q,r;
        l=st.length();
        for(i=0;i<l;i++)/*logic to convert alphabet into its alphabectical number*/
        {
            ch=st.charAt(i);
            n=(int)ch-64;
            str=str+Integer.toString(n);
        }
        num=Integer.parseInt(str);
        sum=num;
        do//logic to check the word is happy word or not
        {
            num=sum;
            sum=0;
            do
            {
                q=num/10;
                r=num%10;
                sum=sum+r*r;
                num=q;
            }
            while(num!=0);
        }
        while(sum>=10);
        if(sum==1)
        {
            System.out.println("A Happy Word");
        }
        else
        {
            System.out.println("Not A Happy Word");
        }
    }
}