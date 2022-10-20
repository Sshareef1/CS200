import java.util.Scanner;

public class scoring 
{  

/*--------------------------------------------------------------------------------
main method below: 
includes access specifier - public - required for main, 
(other access specifier options: private & protected)
static (does not require an instance of the class to be created 
for method to run ) , 
return type: "void" (means the method will not return a value ), 
method identifier: "main" 
(all apps must have one main method, 
as it marks the start/entry point of the program when executed), 
arguments/parameters: ( ) data to be sent to the method - 
(more details when methods are covered)
---------------------------------------------------------------------------------*/        
   public static void main(String args[ ]) 
   {
               //create any objects if needed (i.e. scanner for keyboard input)
      Scanner s = new Scanner(System.in);
   
              //declare data storage space (constants and variables)
      int nofS;
      String name;
      double score;
      double hs = 0;
      String best = "";
              
                 
   
              //get  input as required by program specifications
      System.out.print("enter ur nofs: ");
      nofS = s.nextInt();
              
 // // System.out.print("enter ur best: ");
// //       best = s.nextLine(); 
// //                
// //       System.out.print("enter ur hs: ");
// //       hs = s.nextDouble();
                
      while( nofS>0) {
      System.out.print("enter ur name: ");
      name = s.next();
      
      System.out.print("enter ur score: ");
      score = s.nextDouble();
     
     if(score> hs){
      hs = score;
      best = name;
      }//close
      
    
      nofS--;
      }
      
      System.out.print("The highest score is: " + hs+ " The winner name is: " +best);
      
   
              //process data as required by program specifications
   
              //display results as required by program specifications
   			  
   			  
   } //closing main method
} //closing class header
