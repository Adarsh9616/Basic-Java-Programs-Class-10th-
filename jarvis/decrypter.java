import java.io.*;
class decrypter
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
        System.out.println("Enter the encrypted password:");
        String s=dis.readLine();
        int l=s.length();
        int n=l/2;
        int k=0;
        int m=0;
        String ss="";
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(n+i);
            for(int j=0;j<16;j++)
            {
                if(ch==ar1[j])
                {
                    k=j;
                }
            }
            for(int j=0;j<6;j++)
            {
                if(ch1==ar2[j])
                {
                    m=j;
                }
            }
            char x=ar[m][k];
            ss=ss+x;
        }
        System.out.println("Decrypted password: "+ss);
    }
}
                    
                    
            
            
                
        