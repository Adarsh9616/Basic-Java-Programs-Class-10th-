import java.io.*;
class aaa
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("enter the length of an array:");
        int n=Integer.parseInt(dis.readLine());
        int ar[]=new int[n];
        System.out.println("enter elements:");
        for(int a=0;a<n;a++)
        {
            ar[a]=Integer.parseInt(dis.readLine());
        }
        int temp;
        int min;
        int p;
        for(int i=0;i<n;i++)
        {
            min=ar[i];
            p=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<min)
                {
                    min=ar[j];
                    p=j;
                }
            }
            temp=ar[i];
            ar[i]=ar[p];
            ar[p]=temp;
        }
        System.out.println("Sorted elements:");
        for(int h=0;h<n;h++)
        {
            System.out.println(ar[h]);
        }
    }
}


        
        