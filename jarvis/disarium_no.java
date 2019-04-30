import java.io.*;
class disarium_no
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the no.");
        int a=Integer.parseInt(dis.readLine());
        String s=String.valueOf(a);
        String st="";
        int k;
        int sum=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            st=st+c;
            k=Integer.parseInt(st);
            k=(int)Math.pow(k,(i+1));
            sum=sum+k;
            st="";
        }
        if(sum==a)
        {
            System.out.println("Entered no. is a disarium no.");
        }
        else
        {
            System.out.println("Entered no. is not a disarium no.");
        }
    }
}