import java.io.*;
class tic_tac_toe
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        String ar[][]=new String[3][3];
        tic_tac_toe ob=new tic_tac_toe();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar[i][j]="_";
            }
        }
        for(int k=1;k<=9;k++)
        {
            if(k%2==0)
            {
                System.out.println("Second player's chance");
            }
            else
            {
                System.out.println("first player's chance");
            }
            System.out.println("Enter position");
            int m=Integer.parseInt(dis.readLine());
            int n=Integer.parseInt(dis.readLine());
            ob.print(ar);
            ob.enter(m,n,k,ar);
            ob.print(ar);
            int c=ob.condition(ar);
            if(c==1)
            {
                if(k%2==0)
                {
                    System.out.println("Player 2 won");
                }
                else
                {
                    System.out.println("Player 1 won");
                }
                break;
            }
            if(k==9&&c!=1)
            {
                System.out.println("its a tie");
            }
        }

    }

    void enter(int m,int n,int r,String ar[][])
    {
        if(r%2==0)
        {
            ar[m][n]="O";
        }
        else
        {
            ar[m][n]="X";
        }
        System.out.println("\f");
    }

    void print(String ar[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }

    int condition(String ar[][])
    {
        int c=0;
        for(int i=0;i<3;i++)
        {
            if(ar[i][2]==ar[i][1]&&ar[i][1]==ar[i][0])
            {
                if(ar[2][2]!="_")
                {
                    c=1;
                }
            }
        }
        for(int j=0;j<3;j++)
        {
            if(ar[2][j]==ar[1][j]&&ar[1][j]==ar[0][j])
            {
                if(ar[2][2]!="_")
                {
                    c=1;
                }
            }
        }
        if(ar[2][2]==ar[1][1]&&ar[1][1]==ar[0][0])
        {
            if(ar[2][2]!="_")
            {
                c=1;
            }

        }
        if(ar[2][0]==ar[1][1]&&ar[1][1]==ar[0][2])
        {
            if(ar[2][2]!="_")
            {
                c=1;
            }
        }
        return c;
    }
}

           
        
       
        