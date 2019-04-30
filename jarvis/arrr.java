import java.io.*;
class arrr
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the length of an array");
        int x=Integer.parseInt(dis.readLine());
        String ar[]=new String[x];
        for(int i=0;i<x;i++)
        {
            ar[i]=dis.readLine();
        }
        int ub=x-1;
        int lb=0;
        int flag=0;
        String min;
        int p;
        String temp;
        for(int k=0;k<x;k++)
        {
            min=ar[k];
            p=k;
            for(int j=k+1;j<x;j++)
            {
                if(ar[j].compareTo(min)<0)
                {
                    min=ar[j];
                    p=j;
                }
            }
            temp=ar[k];
            ar[k]=ar[p];
            ar[p]=temp;
        }
        System.out.println("enter the word to be searched");
        String s=dis.readLine();
        while(lb<ub)
        {
            int mid=(ub+lb)/2;
            if(s.compareTo(ar[mid])<0)
            {
                ub=mid-1;
            }
            if(s.compareTo(ar[mid])>0)
            {
                lb=mid+1;
            }
            if(s.compareTo(ar[mid])==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("not present");
        }
    }
}