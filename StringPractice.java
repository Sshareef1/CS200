//import API's needed here:
import java.util.Scanner;


public class StringPractice 
{  

        public static void main(String args[ ]) 
        {
                  Scanner input = new Scanner(System.in);
                  //variable / storage space should be delcared here this for learning puropese only
                  final String myName ="joe"; //declaring constant
                  System.out.println(myName); 
                     
                  // myName = "joe"; +++++nono
                  
                  String one = "Hello"; //UC S in string bc it is an object, use "" to encase string
                  //hello itself is a literal, it intilised the storage space called one.
                  System.out.println(one);
                  one = "goodbye"; //reassignming a value to "one" storage space
                  System.out.println(one);
                  
                  String two; //just storage declaration
                  //System.out.println(two); //variable two might not have been initialized
                  two ="\"coding is fun!\"";//intialization and strings can have spaces and punctutaion
                  //\notes an escape sequence e.g. \" displays a quote mark
                                    System.out.println(two);
                   //get "two" from the user
                   System.out.println("how u feel coding? "); // step 1 of 2 step: prompt and store
                   two= input.nextLine();
                   System.out.println(two);
                   
                   
                   char first; //declaration
                   char secound = 'A';//single quote for char
                   //char third = "F"; //wont work double quotes
                   first = one.charAt(0);//stored a portion of a string(one char) in a char
                   System.out.println(first);
                   
                   String three = "";//empty string
                   System.out.println("xxx" + three + "yyy"); //= xxxyyy
                   
                   String four = " ";// string has blank
                   System.out.println("xxx" + four + "yyy"); //= has space  xxx yyy
                   
                   int x =2;
                   
                   if(x==2) //true
                   three= "yes";
                   else
                   three ="no";
                   
                   System.out.println(three);

                   




				  
				  
         } //closing main method
} //closing class header