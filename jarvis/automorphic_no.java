import java.io.*;
class automorphic_no
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the no");
        int a =Integer.parseInt(dis.readLine());
        int k=a*a;
        String st=String.valueOf(a);
        String s=String.valueOf(k);
        if(s.endsWith(st))
        {
            System.out.println("Entered no is an automorphic no.");
        }
        else
        {
            System.out.println("Entered no is not an automorphic no.");
        }
    }
}    