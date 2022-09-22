import java.util.Scanner;
//Import Scanner class
public class HelloWorld2
{
    public static void main(String args[ ])
    {
        Scanner myAge = new Scanner(System.in);
        //Declare Scanner object for age
        System.out.println("Hello World!"+ "\nMy Nameis S. Shareef");
        //system.out.println() is to display output to the screen
        //\n to add a newline

        //text between quotes is called a string literal
        System.out.print("Please enter your age(integer number only): ");

        //Prompt a message to ask for age
        int age = myAge.nextInt();

        //Input age
        System.out.println("Your name is: S. Shareef, and your age is: " + age);
//Print out user's name and age
    }
}
