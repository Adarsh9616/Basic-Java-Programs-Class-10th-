import java.io.*;
class isb
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter ISBN No.");
        int a=Integer.parseInt(dis.readLine());
        String s=String.valueOf(a);
        int l=s.length();
        String str="";
        int sum=0;                
        if(l!=10)
        {
            System.out.println("Illegal ISBN");
        }
        else
        {
            for(int i=0;i<l;i++)
            {
                char c=s.charAt(i);
                str=str+c;
                int b=Integer.parseInt(str);
                sum=sum+(b*(i+1));
                str="";
            }
            if(sum%11==0)
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