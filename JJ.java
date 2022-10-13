//import API's needed here:

public class JJ 
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
        int a, b, c, d;
        a=1;
        while (a<5)
        {
         System.out.print (a);
         a++;
         }
         System.out.println ();
for (b = 5; b >=1; b=b/2)
{
System.out.print (b + " ");
}
System.out.println();
a=0;
d=9;

do
{
System.out.println(a);

for(c=a; c>=0; c--)
System.out.print("b");

System.out.println();

a=a + 1;
d= d -2;
}
while (a<d);
}
}
               //create any objects if needed (i.e. scanner for keyboard input)

              //declare data storage space (constants and variables)   

              //get  input as required by program specifications

              //process data as required by program specifications

              //display results as required by program specifications
				  
				  
          //closing main method
 //closing class header