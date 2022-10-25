import java.util.Scanner;
public class primeNum
{  

        public static void main(String args[ ])
        {  Scanner check = new Scanner(System.in);
               
        int user = 0;
        char quit = 'Q';
        
        
        String pick= "";
        boolean NotPrime = false;
   

          System.out.print("Enter user or Q to END): ");
          
          pick  = check.nextLine();
           
           
          while (!pick.equals("Q"))
          {
                   
            user = Integer.parseInt(pick);
           
            if(user == 2 || user == 3)
              System.out.println(user + " is  prime userber");
    
            else{
            
              for(int i =2;i<= Math.ceil(user/2)  &&  NotPrime == false;i++)
              {
                if(user % i != 0)
                  NotPrime = false;
                else
                {
                  System.out.println(user + " not  prime userber");
                  NotPrime = true;
                }
               }
           
           
            if(NotPrime == false)
              System.out.println (user + " is prime userber");
            }
           
           
              System.out.print("Enter user or Q to END): ");
              pick  = check.nextLine();
              NotPrime =false;
           
            }
   

         } //closing main method
} //closing class header