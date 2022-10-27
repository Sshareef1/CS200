import java.util.Scanner;
public class RPS {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);

    String userName;
    int compChoice;
    boolean isValid = true;
    int userInput;
    int userWon = 0;
    int compWon = 0;
    boolean hasWon = false;

    System.out.println("What is your name");
    userName = kbd.nextLine();

    while (hasWon == false && isValid == true) {
      System.out.println("0 for rock, 1 for paper, 2 for scissors");
      userInput = kbd.nextInt();

      if (userInput >= 0 && userInput <= 2)
        isValid = true;
        
      compChoice = (int)(Math.random() * 3);

      if ((userInput == 0 && compChoice == 2) || (userInput == 1 && compChoice == 0) || (userInput == 2 && compChoice == 1)) {
        userWon++;
        System.out.println(userName + " won the round");
      } else if (userInput == compChoice) {
        System.out.println("It's a tie try again");
      } else {
        compWon++;
        System.out.println("computer won round");
      }
      if (userWon == 2 || compWon == 2) {
        hasWon = true;
      } else {
        hasWon = false;
      }

    } //end of while loop

    if (userWon == 2)
      System.out.println(userName +" won the Game");
    else if (isValid == false)
      System.out.println("Invalid input");
    else
      System.out.println("Computer won the game");

  } //end of main
} //end of class