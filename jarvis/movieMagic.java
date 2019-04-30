import java.io.*;
class movieMagic
{
    int year;
    String title;
    float rating;
    movieMagic()
    {
        year=0;
        title="";
        rating=0;
    }
    void accept()throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter title of movie:");
        title=dis.readLine();
        System.out.println("Enter year:");
        year=Integer.parseInt(dis.readLine());
        System.out.println("Enter rating:");
        rating=Float.parseFloat(dis.readLine());
    }
    void display()
    {
        System.out.println("Title:"+title);
        System.out.println("Year:"+year);
        if(rating<=2.0)
        {
            System.out.println("Flop");
        }
        else if(rating>=2.1&&rating<=3.4)
        {
            System.out.println("Semi-hit");
        }
        else if(rating>=3.5&&rating<=4.5)
        {
            System.out.println("Hit");
        }
        else
        {
            System.out.println("Super Hit");
        }
    }
    public static void main(String args[])throws IOException
    {
        movieMagic ob=new movieMagic();
        ob.accept();
        ob.display();
    }
}

        
        
