
//import API's needed here:


public class Drillfor10
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
        
        int ans = countEights(1,2,8,4,-8);
        System.out.println(ans);
        }
        public static int countEights( int a, int b, int c, int d, int e)
        {
         int count = 0;
         
         if(a==8 || a==-8)
            count++;
           if(b==8 || b==-8)
            count++;
              if(c==8 || c==-8)
            count++;
              if(d==8 || d==-8)
            count++;
              if(e==8 || e==-8)
            count++;




         return count;
         				  
         } //closing main method
} //closing class header
