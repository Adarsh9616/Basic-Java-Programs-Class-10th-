import java.io.*;
class p_p
{
    int prime(int a)
    {
        int c=0;
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        return c;
    }

    void palindrome(int a)
    {
        String s=String.valueOf(a);
        String st="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            st=c+st;
        }
        if(s.equals(st))
        {
            System.out.println(a);
        }
    }
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        p_p obj=new p_p();
        System.out.println("Enter range");
        int a=Integer.parseInt(dis.readLine());
        int b=Integer.parseInt(dis.readLine());
        for(;a<=b;a++)
        {
            int p=obj.prime(a);
            if(p==0)
            {
                obj.palindrome(a);
            }
        }
    }
}

