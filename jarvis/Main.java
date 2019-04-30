import java.util.*;

public class Main {
   
    public static void main(String[] args) 
    {
       Scanner in= new Scanner (System.in);
        int w=in.nextInt();
        if(w>2&&w<101&&w%2==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
    