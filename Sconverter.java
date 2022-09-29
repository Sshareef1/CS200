//import API's needed here:
import java.util.Scanner;

public class Sconverter 
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
               Scanner bro= new Scanner(System.in);

              //declare data storage space (constants and variables)   
              int sec;
              int hrs;
              int min;
              

              //get  input as required by program specifications
               System.out.print("Enter ur secs: ");
               sec=bro.nextInt();
              

              //process data as required by program specifications
              
              hrs=sec/(60*60);
              min=(sec%(60*60)/60);
              sec=(sec%(60*60*hrs))%60;

              //display results as required by program specifications
				  System.out.print( hrs+ ":"+min+":"+sec);
				  
         } //closing main method
} //closing class header
