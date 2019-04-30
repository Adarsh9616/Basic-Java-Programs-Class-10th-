import java.io.*;
class arr2d
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the size of an array");
        int a=Integer.parseInt(dis.readLine());
        int b=Integer.parseInt(dis.readLine());
        int ar[][]=new int[a][b];
        
        int sum=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                ar[i][j]=Integer.parseInt(dis.readLine());
            }
        }
        
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(i==0||i==(a-1)||j==0||j==(b-1))
                {
                    sum=sum+ar[i][j];
                }
            }
        }
        sum=sum;
        System.out.println(sum);
    }
}

            

        
