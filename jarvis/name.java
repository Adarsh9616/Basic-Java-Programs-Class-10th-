import java.io.*;
class  name
{
   public static void main(String args[])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter any name =>");
       String name=br.readLine();
       int a=name.length();
       int ch=0;
       for(int b=0;b<a;b++)
       {
           char c=name.charAt(b);
           if(c=='a'||c=='A')
           {
               ch=1;
           }
           else if(c=='b'||c=='B')
           {
               ch=2;
           }
           else if(c=='c'||c=='C')
           {
               ch=3;
           }
           else if(c=='d'||c=='D')
           {
               ch=4;
           }
           else if(c=='e'||c=='E')
           {
               ch=5;
           }
           else if(c=='f'||c=='F')
           {
               ch=6;
           }
           else if(c=='g'||c=='G')
           {
               ch=7;
           }
           else if(c=='h'||c=='H')
           {
               ch=8;
           }
           else if(c=='i'||c=='I')
           {
               ch=9;
           }
           else if(c=='j'||c=='J')
           {
               ch=10;
           }
           else if(c=='k'||c=='K')
           {
               ch=11;
           }
           else if(c=='l'||c=='L')
           {
               ch=12;
           }
           else if(c=='m'||c=='M')
           {
               ch=13;
           }
           else if(c=='n'||c=='N')
           {
               ch=14;
           }
           else if(c=='o'||c=='O')
           {
               ch=15;
           }
           else if(c=='p'||c=='P')
           {
               ch=16;
           }
           else if(c=='q'||c=='Q')
           {
               ch=17;
           }
           else if(c=='r'||c=='R')
           {
               ch=18;
           }
           else if(c=='s'||c=='S')
           {
               ch=19;
           }
           else if(c=='t'||c=='T')
           {
               ch=20;
           }
           else if(c=='u'||c=='U')
           {
               ch=21;
           }
           else if(c=='v'||c=='V')
           {
               ch=22;
           }
           else if(c=='w'||c=='W')
           {
               ch=23;
           }
           else if(c=='x'||c=='X')
           {
               ch=24;
           }
           else if(c=='y'||c=='Y')
           {
               ch=25;
           }
           else if(c=='z'||c=='Z')
           {
               ch=26;
           }
           switch(ch)
           {
               case 1:
               System.out.println("     *     ");
               System.out.println("    * *    ");
               System.out.println("   *   *   ");
               System.out.println("  *******  ");
               System.out.println(" *       * ");
               System.out.println("*         *");
               break;
               case 2:
               System.out.println("*******");
               System.out.println("*      **");
               System.out.println("*      **");
               System.out.println("*******");
               System.out.println("*      **");
               System.out.println("*      **");
               System.out.println("*******");         
               break;
               case 3:
               System.out.println("  *******");
               System.out.println(" *       *");
               System.out.println("*");
               System.out.println("*");
               System.out.println("*");
               System.out.println(" *       *");
               System.out.println("  *******");
               break;
               case 4:
               System.out.println(" *********");
               System.out.println("*         *");
               System.out.println("*          *");
               System.out.println("*          *");
               System.out.println("*          *");
               System.out.println("*         *");
               System.out.println(" *********");
               break;
               case 5:
               System.out.println("*********");
               System.out.println("*        ");
               System.out.println("*        ");
               System.out.println("*********");
               System.out.println("*        ");
               System.out.println("*        ");
               System.out.println("*********");
               break;
               case 6:
               System.out.println("**********");
               System.out.println("*         ");
               System.out.println("******    ");
               System.out.println("*         ");
               System.out.println("*         ");
               System.out.println("*         ");
               break;
               case 7:
               System.out.println("  *******");
               System.out.println(" *       *");
               System.out.println("*         ");
               System.out.println("*         ");
               System.out.println("*        ***");
               System.out.println(" *       * *");
               System.out.println("  *******  *");
               break;
               case 8:
               System.out.println("*         *");               
               System.out.println("*         *");               
               System.out.println("*         *");
               System.out.println("***********");               
               System.out.println("*         *");               
               System.out.println("*         *");
               System.out.println("*         *");
               break;
               case 9:
               System.out.println("***********");               
               System.out.println("     *     ");               
               System.out.println("     *     ");               
               System.out.println("     *     ");               
               System.out.println("     *     ");
               System.out.println("     *     ");               
               System.out.println("***********");
               break;
               case 10:
               System.out.println("**********");               
               System.out.println("     *     ");               
               System.out.println("     *     ");               
               System.out.println(" *   *     ");               
               System.out.println(" *****     ");
               break;
               case 11:
               System.out.println(" *      * ");               
               System.out.println(" *     *   ");               
               System.out.println(" *   *     ");
               System.out.println(" * *       ");               
               System.out.println(" *  *      ");               
               System.out.println(" *    *    ");
               System.out.println(" *      *  ");
               break;
               case 12:
               System.out.println("*         ");               
               System.out.println("*         ");               
               System.out.println("*         ");               
               System.out.println("*         ");               
               System.out.println("* * * * * ");
               break;
               case 13:
               System.out.println("**       ** ");               
               System.out.println("*  *   *  *");               
               System.out.println("*    *    *");
               System.out.println("*         *");               
               System.out.println("*         *");               
               System.out.println("*         *");
               break;
               case 14:
               System.out.println("**      *");               
               System.out.println("*  *    *");               
               System.out.println("*   *   *");
               System.out.println("*    *  *");               
               System.out.println("*     * *");               
               System.out.println("*      **");
               break;
               case 15:
               System.out.println("   ****       ");               
               System.out.println("  *    *   ");               
               System.out.println(" *      * ");
               System.out.println("*        * ");               
               System.out.println("*        * ");               
               System.out.println(" *      *  ");
               System.out.println("  *    *   ");
               System.out.println("   ****    ");
               break;
               case 16:
               System.out.println("  *****     ");               
               System.out.println("  *   *     ");               
               System.out.println("  *****     ");               
               System.out.println("  *         ");               
               System.out.println("  *         ");
               break;
               case 17:
               System.out.println(" * * * *     ");               
               System.out.println(" *     *     ");               
               System.out.println(" *  *  *     ");               
               System.out.println(" * * * *     ");               
               System.out.println("      *      ");
               break;
               case 18:
               System.out.println("  ** * *         ");               
               System.out.println("  *    *         ");               
               System.out.println("  ** * *         ");               
               System.out.println("  * *            ");               
               System.out.println("  *  *           ");
               System.out.println("  *   *          ");
               break;
               case 19:
               System.out.println("  * * * *         ");               
               System.out.println("  *               ");
               System.out.println("  *               ");               
               System.out.println("  * * * *         ");
               System.out.println("        *         ");               
               System.out.println("        *         ");               
               System.out.println("  * * * *         ");
               break;
               case 20:
               System.out.println("  * * * * *   ");               
               System.out.println("      *       ");               
               System.out.println("      *       ");
               System.out.println("      *       ");               
               System.out.println("      *       ");               
               System.out.println("      *       ");
               break;
               case 21:
               System.out.println(" *       *  ");               
               System.out.println(" *       *  ");               
               System.out.println(" *       *  ");
               System.out.println(" *       *  ");               
               System.out.println(" *       *  ");               
               System.out.println(" * * * * *  ");
               break;
               case 22:
               System.out.println("*         *");               
               System.out.println(" *       * ");               
               System.out.println("  *     *  ");
               System.out.println("   *   *   ");               
               System.out.println("    * *    ");               
               System.out.println("     *    ");
               break;
               case 23:
               System.out.println("*                * ");               
               System.out.println(" *              *  ");               
               System.out.println("  *            *   ");
               System.out.println("   *    **    *    ");               
               System.out.println("    *  *  *  *     ");               
               System.out.println("     **    **      ");
               break;
               case 24:
               System.out.println("  *     *    ");               
               System.out.println("   *   *     ");               
               System.out.println("    * *      ");
               System.out.println("     *      ");               
               System.out.println("   *   *     ");               
               System.out.println("  *     *    ");
               break;
               case 25:
               System.out.println("  *     *    ");               
               System.out.println("   *   *     ");               
               System.out.println("    * *      ");
               System.out.println("     *      ");               
               System.out.println("     *      ");               
               System.out.println("     *      ");
               break;
               case 26:
               System.out.println("* * * * * ");               
               System.out.println("       *  ");               
               System.out.println("     *    ");
               System.out.println("    *     ");               
               System.out.println("   *      ");               
               System.out.println("  *      ");
               System.out.println(" * * * * *");               
               break;
               default:
               System.out.println("         ");               
               System.out.println("         ");               
               System.out.println("         ");
           }
          
        }
    }
}