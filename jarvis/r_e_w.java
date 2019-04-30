import java.io.*;
class r_e_w
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter any name =>");
        String s=dis.readLine();
        s=s+" ";
        int l=s.length();
        String st="";
        String stm="";
        String str="";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                str=str+c;
            }
            else
            {
                int j=str.length();
                for(int k=0;k<j;k++)
                {
                    char m=str.charAt(k);
                    st=m+st;
                }
                str="";
                stm=stm+st+" ";
                
            }
            st="";
        }
        System.out.println(stm);
    }
}