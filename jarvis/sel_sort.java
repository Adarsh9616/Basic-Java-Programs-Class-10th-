import java.io.*;
class sel_sort
{
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice \n 1.Sorting names \n 2.Sorting numbers");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:System.out.print("Enter number of names:");
            int n=Integer.parseInt(br.readLine());
            String s[]=new String[n];
            System.out.println("Enter names");
            for(int i=0;i<n;i++)
            {
                s[i]=br.readLine();
            }
            int p;
            String min,temp;
            for(int i=0;i<n;i++)
            {
                min=s[i];
                p=i;
                for(int j=i+1;j<n;j++)
                {
                    if(s[j].compareTo(min)<0)
                    {
                        min=s[j];
                        p=j;
                    }
                }
                temp=s[i];
                s[i]=s[p];
                s[p]=temp;
            }
            System.out.println("Sorted array");
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]+" ");
            }
            break;
            case 2:System.out.print("Enter number of numbers:");
            int x=Integer.parseInt(br.readLine());
            double a[]=new double[x];
            System.out.println("Enter numbers");
            for(int i=0;i<x;i++)
            {
                a[i]=Double.parseDouble(br.readLine());
            }
            int q;
            double min2,temp2;
            for(int i=0;i<x;i++)
            {
                min2=a[i];
                q=i;
                for(int j=i+1;j<x;j++)
                {
                    if(a[j]>min2)
                    {
                        min2=a[j];
                        q=j;
                    }
                }
                temp2=a[i];
                a[i]=a[q];
                a[q]=temp2;
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
