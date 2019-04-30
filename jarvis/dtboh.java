import java.io.*;
class dtboh
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a decimal No.");
        int a=Integer.parseInt(dis.readLine());
        String s="";
        int k;
        int b=a;
        int c=a;
        while(a>=1)
        {
            k=a%2;
            s=k+s;
            a=a/2;
        }
        System.out.println("Binary of a No.="+s);
        String ss="";
        k=0;
        while(b>=1)
        {
            k=b%8;
            ss=k+ss;
            b=b/8;
        }
        System.out.println("Octal of the no. = "+ss);
        String sss="";
        k=0;
        while(c>=1)
        {
            k=c%16;
            if(k>9)
            {
                
                sss=(char)('A'+(k-10))+sss;
            }
            else
            {
                sss=k+sss;
            }
            c=c/16;
        }
        System.out.println("Hexa decimal of the no. = "+sss);
        
    }
}

          
            
        
        