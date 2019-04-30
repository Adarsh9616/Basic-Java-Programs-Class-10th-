import java.io.*;
class ISBN
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the ISBN no.");
        long i=Long.parseLong(br.readLine());
        long temp=i;
        long x=1;
        long s=0;
        long c=0;long d;long rev=0;
        while(temp>0)
        {
            temp=temp/10;
            c++;
        }
        if(c!=10)
        {
            System.out.println("Illegal ISBN");
        }
        else
        {
            while(i>0)
            {
              d=i%10;
              rev=rev*10+d;
              i=i/10;
            }
            while(rev>0)
            {
                d=rev%10;
                s=s+x*d;
                x++;
                rev=rev/10;
            }
            if(s%11==0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("Illegal ISBN");
            }
        }
    }
}
