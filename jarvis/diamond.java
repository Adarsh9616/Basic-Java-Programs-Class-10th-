class diamond
{
    public static void main(String args[])
    {
        for(int i=1;i<=7;i=i+2)
        {
            for(int j=6;j>i;j=j-2)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int f=5;f>=1;f=f-2)
        {
            for(int m=6;m>f;m=m-2)
            {
                System.out.print(" ");
            }
            for(int n=1;n<=f;n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


               
                    

        