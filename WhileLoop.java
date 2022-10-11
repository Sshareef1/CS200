//import API's needed here:
import java.util.Scanner;

public class WhileLoop 
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
               Scanner K = new Scanner(System.in);

              //declare data storage space (constants and variables)   
              int user;
              int count= 0;
              int sum= 0;
              float mean;
              
              System.out.println("Please enter + and - integers to stop");
              
              System.out.print("Please enter interger: ");
              user= K.nextInt();
              
              while(user>=0)
              {
              sum= sum+ user;
              count++;
              
              System.out.print("Please enter interger: ");
              user= K.nextInt();

}
mean = (float)sum/count;
System.out.print(" The sum is: " + sum + " and the mean is: " + mean);
              //get  input as required by program specifications

              //process data as required by program specifications

              //display results as required by program specifications
				  
				  
         } //closing main method
} //closing class header