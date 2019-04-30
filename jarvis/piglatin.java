import java.io.*;
class piglatin
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the string");
        String s=dis.readLine();
        int l=s.length();
        s=s.toUpperCase();
        String str="";
        String stv="";
        String st="";
        int m=0;
        for(int i=0;i<l;i++)
        {
            char a=s.charAt(i);
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            {
                m=i;
                break;
            }
        }
        st=s.substring(m);
        stv=s.substring(0,m);
        str=st+stv+"AY";
        System.out.println(str);
    }
}