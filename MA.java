//import API's needed here:

import java.util.scanner;
public class MA 
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
                  scanner MA = new scanner(System.in);
                  
                  String user;
                  char in;
                  boolean run = true;
                  
                  do{
                  
                  System.outprint("please enter a letter of the english alphabet: ");
                  user= MA.nextLine();
                  
                  in =user.charAt(0);
                  
                  if(in>='A' && in <='Z')
                      System.outprintln("upper case letter");
                    else
                     if(in>='a' && in <='z')
                      System.outprintln("lower case letter");
                      
                     

                  
                  }while(run==true); ///end of loop 
                  
                  
               //create any objects if needed (i.e. scanner for keyboard input)

              //declare data storage space (constants and variables)   

              //get  input as required by program specifications

              //process data as required by program specifications

              //display results as required by program specifications
				  
				  
         } //closing main method
} //closing class header