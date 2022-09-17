//import API's needed here:

import java.util.Scanner;

public class ToothpasteAlert
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
           	Scanner Moh = new Scanner(System.in);

          	//declare data storage space (constants and variables)
          	double qtyPaste;
          	float  days;
          	int wDay;
          	double left;   

          	//get  input as required by program specifications
          	System.out.print("How many unces of toothpaste? ");
          	qtyPaste = Moh.nextDouble();

          	//process data as required by program specifications
          	days=(float)qtyPaste/(.095f*2);
          	left=days - Math.floor(days);
          	days=(float)Math.floor(days);
          	wDay=(int) days -1;

          	//display results as required by program specifications
   			   System.out.println("Warning: low on toothpaste!\n " +wDay + "days of toothpaste used.\n" + "Quantitiy left in tube is: " + left);
         	 
   			   
     	} //closing main method
} //closing class header
