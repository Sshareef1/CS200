//import API's needed here:

import java.util.Scanner;

public class TConverter
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
           	Scanner Grace= new Scanner(System.in);

          	//declare data storage space (constants and variables)   
          	float userT;
          	float conT =0;
          	char tempType;
          	String cOrF;
          	boolean okData = true;
         	 

          	//get  input as required by program specifications
          	System.out.print("type of temp u entering? Celius or franheiit");
          	cOrF=Grace.nextLine();
         	 
          	System.out.print("What Temp?");
          	userT=Grace.nextFloat();
         	 
          	tempType= cOrF.charAt(0);
         	 
          	if(tempType == 'c' || tempType == 'C')
          	conT=userT*1.8f +32; //Sam
          	else
         	 
          	if(tempType == 'f' || tempType == 'F')
          	conT = (userT-32) *5/9;//Lam
         	 
          	else
          	okData = false;
         	 
          	if (okData== true){
         	 
          	System.out.print("converted temp is: "+ conT);
          	if (tempType=='F' || tempType=='f')
          	tempType = 'C';
          	else
          	tempType= 'F';
         	 
          	System.out.print(tempType);
          	}//end of if
         	 
          	else
         	 
          	System.out.println("Invalid Entry ... process Terminating");

          	//process data as required by program specifications

          	//display results as required by program specifications
   			   
   			   
     	} //closing main method
} //closing class header
