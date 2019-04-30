import java.io.*;
class encrypter
{
    public static void main (String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        char[][] ar=
        {
            {'`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'},
            {'p','q','r','s','t','u','v','w','x','y','z','{','|','}','~',0},
            {'@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'},
            {'P','Q','R','S','T','U','V','W','X','Y','Z','[','\\',']','^','_'},
            {'0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?'},
            {' ','!','"','#','$','%','&','\'','(',')','*','+',',','-','.','/'}
        };        
        char[] ar1={'1','a','M','Q','f','7','g','T','9','4','L','W','e','6','y','C'};
        char[] ar2={'g','T','f','7','Q','M'};
        System.out.println("Enter the decrypted password:");
        String s=dis.readLine();
        String ss="";
        String ss1="";
        String ss2="";
        int k=0;
        int m=0;
        int l=s.length();
        for(int a=0;a<l;a++)
        { 
            char ch=s.charAt(a);
            for(int i=0;i<6;i++)
            {
                for(int j=0;j<16;j++)
                {
                    if(ch==ar[i][j])
                    {
                        k=i;
                        m=j;
                    }
                }
            }
            ss1=ss1+ar1[m];
            ss2=ss2+ar2[k];
        }
        ss=ss1+ss2;
        System.out.println("encrypted password: "+ss);
    }
}
                
                
                    
          

            
            
                
        