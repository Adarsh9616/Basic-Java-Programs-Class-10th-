import java.io.*;
class p_4
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a string");
        String s=dis.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            System.out.println(s.substring(0,(i+1)));
        }
        for(int j=l-2;j>=0;j--)
        {
            System.out.println(s.substring(0,(j+1)));
        }
    }
}

        
    
    