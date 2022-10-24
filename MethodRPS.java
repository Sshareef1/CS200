//import API's needed here:
import java.util.Scanner;

public class MethodRPS 
{  

        public static void main(String args[ ]) 
        {
            Scanner Randy = new Scanner(System.in);
            
            int comp;
            int user;
            char winner = 'c';//u - user, c - computer, t - tie
            
            comp = GetComp();
            //System.out.println(comp);
            
            user = GetUser();
            
            //winner = PlayGame(comp, user);
            
            WinnerIs(winner);
          

}//end of main

public static int GetUser()
{
   Scanner Lam = new Scanner(System.in);
   int in;
   boolean valid = false;
   do{
   
      System.out.print("Choose 0= rock, 1=paper, 2=scissors: ");
      in = Lam.nextInt();
      valid = isValid(in);
   
   }while(valid==false);
   return in;

}//end of GetUser

public static boolean isValid(int x)
{
   boolean ok = false;
   if(x>=0 && x<=2)
      ok = true;
      
   return ok;
}//end of isValid


public static int GetComp()
{
   int c;
   c= (int)(Math.random()*1000000000) % 3;
   return c;

}//end of GetComp

public static void WinnerIs(char a)
{
   switch(a)
   {
   case('u'):
      System.out.println("You win!");
      break;
   case('c'):
      System.out.println("Computer Wins!");
      break;
   default:
      System.out.println("It was a tie!");


      
   
   }//end of switch

}//end of Winner is


}//end of class