import java.io.*;
class lcm
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("enter 2 no..");
        int a=Integer.parseInt(dis.readLine());
        int b=Integer.parseInt(dis.readLine());
        int p=a*b;
        if(b>a)
        {
            int x=a;
            a=b;
            b=x;
        }
        int t;

        while(a%b!=0)
        {
            t=a;
            a=b;
            b=t%b;

        }
        int lcm=p/b;
        System.out.println(lcm);
    }
}
        