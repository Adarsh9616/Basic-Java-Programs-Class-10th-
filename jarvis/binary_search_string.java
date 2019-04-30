import java.io.*;
class binary_search_string
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the size of an array");
        int a=Integer.parseInt(dis.readLine());
        String ar[]=new String[a];
        int mid;
        int lb=0;
        int ub=a-1;
        int flag=0;
        System.out.println("Enter the values of an array");
        for(int m=0;m<a;m++)
        {
            ar[m]=dis.readLine();
        }
        System.out.println("Enter the element to be serched");
        String n=dis.readLine();
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(n.compareTo(ar[mid])<0)
            {
                ub=mid-1;
            }
            if(n.compareTo(ar[mid])>0)
            {
                lb=mid+1;
            }
            if(n.equals(ar[mid]))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }
    }
}
            
        