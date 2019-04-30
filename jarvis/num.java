class num
{
    void num_calc(int num,char ch)
    {
        if(ch=='s')
        {
            System.out.println(Math.pow(num,2));
        }
        else
        {
            System.out.println(Math.pow(num,3));
        }
    }
    void num_calc(int a,int b,char ch)
    {
        if(ch=='p')
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
    void num_calc(String s1,String s2)
    {
        if(s1.equals(s2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
