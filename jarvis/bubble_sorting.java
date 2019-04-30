import java.io.*;
class bubble_sorting
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the size of an array");
        int a=Integer.parseInt(dis.readLine());
        int ar[]=new int[a];
        int min;
        int temp;
        System.out.println("Enter the valuse of an array");
        for(int m=0;m<a;m++)
        {
            ar[m]=Integer.parseInt(dis.readLine());
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<(a-1);j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array");
         for(int m=0;m<a;m++)
        {
            System.out.println(ar[m]);
        }
    }
}

        
                    
                    
                
                
                
                
                
                
                
                