class stack
{
    int ar[]=new int[5];
    int sp=-1;
    void push(int num)
    {
        if(sp<4)
        {
            sp++;
            ar[sp]=num;
        }
        else
        {
            System.out.println("Stack overflowed");
        }
    }
    void pop()
    {
        if(sp>-1)
        {
            System.out.println(ar[sp]);
            sp--;
        }
        else
        {
            System.out.println("Stack iz empty");
        }
    }
}