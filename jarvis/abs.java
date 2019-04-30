import java.io.*;
class abs
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the size of an array");
        int x=Integer.parseInt(dis.readLine());
        System.out.println("enter elements:");
        int ar[]=new int[x];
        for(int k=0;k<x;k++)
        {
            ar[k]=Integer.parseInt(dis.readLine());
        }
        int temp;
        for(int i=0;i<x-1;i++)
        {
            for(int j=0;j<x-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int m=0;m<x;m++)
        {
            System.out.println(ar[m]);
        }
    }
}

                    

            