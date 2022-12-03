import java.util.Scanner;

public class myMaze {

   public static void main(String[] args) {
        
      Scanner kbd = new Scanner(System.in);
        
      int[][][] myMaze = new int[10][10][10];
      int amountOfCats =0;
      int randomNumber;
    
        
      int cellEmpty = 0;
      int cheese = 1;
      int catLoss = 2;
        
      int row;
      int column;
      int page;
        
        
        
      for(int i = 0; i < myMaze.length; i++){
         for(int j = 0; j < myMaze.length; j++){
            for(int k = 0; k < myMaze.length; k++){
               myMaze[i][j][k] = 0;
            }//end of lst for loop
         }//end of second
      }//end of third 
      
      while (amountOfCats <= 500){   
         for(int i = 0; i < myMaze.length; i++){
            for(int j = 0; j < myMaze.length; j++){
               for(int k = 0; k < myMaze.length; k++){
                  randomNumber =(int) (Math.random() * 1000 );
                  if(randomNumber % 2 == 0){
                     myMaze[i][j][k] = 2;
                     amountOfCats++;
                  }
                     
               }//end of lst for loop
            }//end of second
         }//end of third 
      }//end of while
      
      
      int chzRow = (int)(Math.random()*10);
      int chzColumn = (int)(Math.random()*10);
      int chzPage = (int)(Math.random()*10);
      myMaze[chzPage][chzRow][chzColumn] = cheese;
   
   System.out.print(chzPage + ",");
  System.out.print(chzRow + ",");
   System.out.print(chzColumn);
    System.out.println("  Winning Numbers");  //test STATEMENT SHOULD BE REMOVED DURING THE GAME
   
      
         /*//test print statement 
      for(int i = 0; i < myMaze.length; i++){
         System.out.println();
         for(int j = 0; j < myMaze.length; j++){
            System.out.println();
            for(int k = 0; k < myMaze.length; k++){
            
               System.out.print(myMaze[i][j][k]); 
            }//third for loop 
         }//second for loop
      }//first for loop*/
     //a int failed = 0;
      boolean gameOver = false;
      while( gameOver == false) { 
         System.out.println("Pick your page from 0-9: ");
         page = kbd.nextInt();
        
         System.out.println("Pick your row from 0-9: ");
         row = kbd.nextInt();
        
         System.out.println("Pick your column from 0-9: ");
         column = kbd.nextInt();
        
        
         if(myMaze[page][row][column]==cheese){
            System.out.println("YOU WON!!");
            gameOver = true;
                     }
         if(myMaze[page][row][column]==catLoss){
            System.out.println("YOU LOSE!!");
            gameOver = true;
         } 
         
         if(myMaze[page][row][column]==cellEmpty){
            System.out.println("TRY AGAIN");
            //failed = 1;
         }
         
       if(gameOver== false ){
  
         if(page == chzPage){
            System.out.println("you are on same page"); 
         }
         else {System.out.println("you are"+  Math.abs(page - chzPage)  + "pages away");   
         }
         
         if(row == chzRow){
            System.out.println("you are on same row");
         }
         else {System.out.println("you are"+  Math.abs(row - chzRow) + "rows away");
         }
         if(column == chzColumn){
            System.out.println("you are on same column");
         }
         else {System.out.println("you are"+  Math.abs(column - chzColumn) + "columns away");
         
         } }
         
         
        /* int[] distFromChz = new int[3];
         distFromChz[0] = Math.abs(page - chzPage);
         distFromChz[1] = Math.abs(row - chzRow);
         distFromChz[2] = Math.abs(column - chzColumn);
         
         // System.out.println(distFromChz[0]);
      //          System.out.println(distFromChz[1]);
      //          System.out.println(distFromChz[2]);
         
        
                           System.out.println("You are " + Math.abs(page - chzPage) + " rows, " + Math.abs(row - chzRow) + " columns and "
            + Math.abs(column - chzColumn) + " pages away from cheese");*/
      }
     
        
    
        
   }//end of main
    
}//end of class
