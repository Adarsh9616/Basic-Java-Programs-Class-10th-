import java.io.*;
class bubble_sort
{
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice \n 1.Sorting names \n 2.Sorting numbers");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:System.out.println("Enter number of names");
            int n=Integer.parseInt(br.readLine());
            String s[]=new String[n];
            System.out.println("Enter names");
            for(int i=0;i<n;i++)
            {
                s[i]=br.readLine();
            }
            String temp="";
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(s[j].compareTo(s[j+1])<0)
                    {
                        temp=s[j];
                        s[j]=s[j+1];
                        s[j+1]=temp;
                    }
                }
            }
            System.out.println("Sorted array");
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]+" ");
            }
            break;
            case 2:System.out.println("Enter number of numbers");
            int x=Integer.parseInt(br.readLine());
            double a[]=new double[x];
            System.out.println("Enter numbers");
            for(int i=0;i<x;i++)
            {
                a[i]=Double.parseDouble(br.readLine());
            }
            double temp2;
            for(int i=0;i<x-1;i++)
            {
                for(int j=0;j<x-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp2=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp2;
                    }
                }
            }
            System.out.println("Sorted array");
            for(int i=0;i<x;i++)
            {
                System.out.println(a[i]+" ");
            }
            break;
            default:System.out.println("Wrong choice");
        }
    }
}
