class overload
{
    void polygon(int n,char ch)
    {
        for(int a=1;a<n;a++)
        {
            for(int b=1;b<n;b++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void polygon(int x,int y)
    {
        for(int a=0;a<y;a++)
        {
            for(int b=0;b<x;b++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    void polygon()
    {
        for(int a=1;a<=3;a++)
        {
            for(int b=1;b<=a;b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
            