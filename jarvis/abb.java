import java.io.*;
class abb
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a string");
        String s=dis.readLine();
        int l=s.length();
        int ls=s.lastIndexOf(' ');
        String a="";
        String st="";
        a=a+Character.toUpperCase(s.charAt(0))+".";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c==' '&&i!=ls)
            {
                a=a+Character.toUpperCase(s.charAt(i+1))+".";
            }
            if(i==ls)
            {
                a=a+Character.toUpperCase(s.charAt(i+1));
            }
        }
        st=st+s.substring(ls+2);
        a=a+st.toLowerCase();
        System.out.println(a);
    }
}

            
            