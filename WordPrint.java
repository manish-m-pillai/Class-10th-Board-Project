import java.io.*;//calling package io.*
public class WordPrint
{
    int size;//instance variable
    String s;//instance variable
    void inString()throws IOException/*function to accept a sentence from the user*/
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println();
        System.out.println("Enter a Sentence");
        s=br.readLine();
    }
    boolean prime(int n)//function to check n is a prime number or not
    {
        boolean b;
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            b=true;
        }
        else
        {
            b=false;
        }
        return b;
    }
    void print()/*function to print words at prime position and also the longest word present at prime position in a sentence*/
    {
        WordPrint ob1 = new WordPrint();//declaring object of the class
        boolean b;
        s=s+" ";
        size=s.length();
        String word="";
        char ch;
        int i,max,pos;
        int l=0;
        int q=0;
        for(i=0;i<size;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                l++;
            }
        }
        String [] st = new String[l];
        String [] prime = new String[l];
        for(i=0;i<size;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                st[q]=word;
                word="";
                q++;
            }
        }
        q=0;
        for(i=0;i<l;i++)
        {
            b=ob1.prime(i+1);
            if(b==true)
            {
                prime[q]=st[i];
                q++;
            }
        }
        if(q>0)
        {
            max=prime[0].length();
            pos=0;
            for(i=1;i<q;i++)
            {
                if(max<prime[i].length())
                {
                    max=prime[i].length();
                    pos=i;
                }
            }
            System.out.println("The Words at Prime Position are:-");
            for(i=0;i<q;i++)
            {
                System.out.println(prime[i]);
            }
            System.out.println("The Longest Word at Prime Position is => "+prime[pos]);
        }
        else
        {
            System.out.println("There are no Words at Prime Position");
        }
    }
    public static void main(String[]args)throws IOException//main function
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        WordPrint ob = new WordPrint();//declaring object of the class
        System.out.println("Enter a Number");
        int n=Integer.parseInt(br.readLine());
        boolean b=ob.prime(n);//calling function
        if(b==true)
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }  
        ob.inString();//calling function
        ob.print();//calling function
    }        
}