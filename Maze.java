import java.util.Scanner;

public class Maze {

    public static void main(String[] args) {
        
        //Scanner kbd = new Scanner(System.in);
        
        int[][][] myMaze = new int[10][10][10];
        int amountOfCats =0;
        boolean hasChesse = false;
        int randomNumber;
        boolean location = false;


        
        
        
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
                     if(randomNumber % 2 == 0 && myMaze[i][j][k] != 1){
                        myMaze[i][j][k] = 2;
                        amountOfCats++;
                      }else if (!hasChesse && randomNumber % 1 == 0 ){
                        myMaze[i][j][k] = 1;
                        hasChesse  = true;  
                     }
                     
            }//end of lst for loop
         }//end of second
      }//end of third 
      }//end of while
      
      
         //test print statement 
        for(int i = 0; i < myMaze.length; i++){
         System.out.println();
         for(int j = 0; j < myMaze.length; j++){
            System.out.println();
            for(int k = 0; k < myMaze.length; k++){
           
               System.out.print(myMaze[i][j][k]); 
                  }//third for loop 
               }//second for loop
            }//first for loop
        
        
        
    }//end of main
    
}//end of class
