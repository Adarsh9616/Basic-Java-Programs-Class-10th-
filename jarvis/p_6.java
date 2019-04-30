class p_6
{ 
    public static void main(String args[])
    {
        String s="abcdcba";
        int l=s.length();
        System.out.println(s);int m=l/2;int n=(l/2)+1;
        for(int i=0;i<5;i=i+2)
        {
            System.out.print(s.substring(0,m));
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            System.out.print(s.substring(n));
            n++;
            m--;
            System.out.println();
        }
        m=2;n=l-2;
        for(int j=2;j>=0;j=j-2)
        {
            System.out.print(s.substring(0,m));
            for(int k=0;k<=j;k++)
            {
                System.out.print(" ");
            }
            System.out.print(s.substring(n));
            n--;
            m++;
            System.out.println();
        }
        System.out.println(s);
    }
}