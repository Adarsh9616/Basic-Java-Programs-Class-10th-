import java.io.*;
class p_3
{
    public static void main(String args[])
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            System.out.println(a*a);
            a=(a*10)+1;
        }
        a=(a-1)/10;
        for(int j=4;j>=1;j--)
        {
            for(int l=4;l>=j;l--)
            {
                System.out.print(" ");
            }
            a=(a-1)/10;
            System.out.println(a*a);
        }                    
    }
}