class p_7
{
    public static void main(String args[])
    {
        
        for(int i=1;i<=20;i=i+2)
        {
            for(int k=20;k>i;k=k-2)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}