//import API's needed here:
import java.util.Scanner;


public class Drillz11a
{  

public static void main(String args[ ]) 
        {
        Scanner kbd = new Scanner(System.in);      

               int qty;
               int a;
               int b;
               int ans;
               int correct =0;
               int incorrect =0;
               System.out.print("how many problems?");
               qty = kbd.nextInt();
               
               for (int i = 0; i <qty;i++)
               {				
               a = (int)(Math.random()* 10000000) % 100;
               if(a==0)
                 a=1;
                b = (int)(Math.random()* 10000000) % 100;
               if(a==0)
                 b=1;
                 
                 System.out.print("problem " + (i++) + ": " + a + " X " +b);
                 ans = kbd.nextInt();
                 
                 if( ans == a*b)
                 correct++;
                 
                 else
                  incorrect++;
                  
               }//end of for
                System.out.println("total score: " + correct +" correct, and " + incorrect + "incorrect.");
                 
				  
         } //closing main method
} //closing class header