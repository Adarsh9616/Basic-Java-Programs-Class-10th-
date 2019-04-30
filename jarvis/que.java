class que
{
    int ar[]=new int[5];
    int f=-1;
    int r=-1;
    void push(int num)
    {
        if(r<4)
        {
            r++;
            ar[r]=num;
        }
        else
        {
            System.out.println("que overflowed");
        }
    }
    void pop()
    {
        if(f<r)
        {
            f++;
            System.out.println(ar[f]);
        }
        else
        {
            System.out.println("que is empty");
            f=r=-1;
        }
    }
}