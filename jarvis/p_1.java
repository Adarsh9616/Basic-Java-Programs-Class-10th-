class p_1
{
    public static void main(String args[])
    {
        for(int i=1;i<=9;i=i+2)
        {
            for(int j=9;j>i;j=j-2)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(i==1||i==5||i==9)
                {
                    if(k%2!=0)
                    {
                        System.out.print("1");
                    }

                    else
                    {
                        System.out.print("0");
                    }
                }
                else
                {
                    if(k%2==0)
                    {
                        System.out.print("1");
                    }

                    else
                    {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}

