import java.io.*;
class p_2
{
    public static void main(String args[])
    {
        for(int i=1;i<=7;i++)
        {
            System.out.print("x");
        }
        System.out.println();
        for(int j=5;j>=1;j--)
        {
            for(int k=1;k<=j;k++)
            {
                System.out.print(" ");
            }
            System.out.println("x");
        }
        for(int l=1;l<=7;l++)
        {
            System.out.print("x");
        }        
    }
}
