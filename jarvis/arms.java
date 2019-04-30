import java.util.*;
class arms
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int sum=0;
        int v;
        for(int b=a;b>0;b=b/10)
        {
            v=b%10;
            int j=v*v*v;
            sum=sum+j;
        }
        if(sum==a)
        {
            System.out.println("Enterd no. is armstrong");
        }
        else
        {
            System.out.println("Enterd no. is not armstrong");
        }
    }
}
            