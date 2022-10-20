//import API's needed here:
import java.util.Scanner;

public class Filename 
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
      Scanner Besian = new Scanner(System.in);
   
              //declare data storage space (constants and variables)   
      int pos = 0; 
      int neg = 0;
      int user;
      boolean Ja = false;
              
   
              //get  input as required by program specifications
   
              //process data as required by program specifications
      do{
         System.out.print("enter an integer: ");
         user = Besian.nextInt();
               
         if(user>0)
            pos++;
            
         else 
            if(user<0)
              neg++;
              
      }while(user !=0);
      
        
       
      System.out.print( pos+ "pos integers entered");
       System.out.print( neg+ "neg integers entered");
       
       

   
              //display results as required by program specifications
   			  
   			  
   } //closing main method
} //closing class header

 public static boolean (String args[ ]) 
   {
if (pos<neg)
   
  return Ja;