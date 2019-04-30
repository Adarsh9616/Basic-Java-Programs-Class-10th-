import java.io.*;
class buzz
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the no");
        int a=Integer.parseInt(dis.readLine());
        String s=String.valueOf(a);
        String st="7";
        if(s.endsWith(st)||a/7==0)
        {
            System.out.println("Enterd no is a buzz no");
        }
        else
        {
            System.out.println("enterd no is not a buzz no");
        }
    }
}
            