//import API's needed here:
import java.util.Scanner;

public class ArrayPractice
{  

  
public static void main(String args[ ]) 
        {
        Scanner chris = new Scanner(System.in);
        String A = "Shaheer";
        final int size = 18;
        
        String []students = new String[size];
        
        students[0] = A;
        for(int i=1;i<size;i++)
        { 
         System.out.print("name please: ");
         students[i] = chris.nextLine();
         
         
        }//end of for 
 
         for(int i = 0;i<size;i++)
         System.out.println(students[i]);
             
				  
         } //closing main method
} //closing class header