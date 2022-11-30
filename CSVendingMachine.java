//import API's needed here:
import java.util.Scanner;
import java.text.DecimalFormat;


public class CSVendingMachine 
{      
public static void main(String args[ ]) 
        {
         	Scanner vend = new Scanner(System.in);	
            DecimalFormat Currency = new DecimalFormat("$ #,###,##0.00"); //currency
            
            int user; // 0-9 choice input
            float userMoney=0.0f; //money entered
            boolean qtyIsAvailable = true;
           /*  bank $100.00
           int q = 40;
           int d = 100;
           int n = 100;
           int b1 = 10;
           int b5 = 5;
           int b10 = 2;
           int b20 = 1; */
           int []bank = new int[7];
           //0=n,1=d,2=q,3=ones,4=fives,5=tens,6=twenties
           bank[0]=100;
           bank[1]=100;
           bank[2]=40;
           bank[3]=10;
           bank[4]=5;
           bank[5]=2;
           bank[6]=1;
           
           boolean enoughInTheBank =true;          
           float currentCost = 0.0f; //based on user selection of item
           
           float extraMoney;//overpayment - needs refunding
           
           /*stock
           String item1 = "Chips";
           float itemCost1 = .75f;
           int itemQty1 = 10;
           
           String item2 = "Money Exchange: 5% fee";
           float itemCost2 = .05f;
           int itemQty2 = 10;

            String item3 = "Crab";
           float itemCost3 = 3.85f;
           int itemQty3 = 10;

            String item4 = "water";
           float itemCost4 = 2.5f;
           int itemQty4 = 10;

            String item5 = "Plutonium";
           float itemCost5 = 5.0f;
           int itemQty5 = 10;

            String item6 = "T-Rex Costume";
           float itemCost6 = 39.0f;
           int itemQty6 = 10;

            String item7 = "Extra Credit";
           float itemCost = 10.75f;
           int itemQty7 = 10;


            String item8 = "Homework";
           float itemCost8 = 50.0f;
           int itemQty8 = 10;


            String item9 = "Mystery Food";
           float itemCost9 = 1.25f;
           int itemQty9 = 10; */
           
           String []item={"Chips","Money Exchange: 5% fee","Crab","water","Plutonium","T-Rex Costume","Extra Credit","Homework","Mystery Food"};
           float []cost= {.75f,.05f,3.85f,2.5f,5.0f,39.0f,10.75f,50.0f,1.25f};           
           int []qty = {0,10,10,10,10,10,10,10,10};
           
           //the process of ordering
           
           do{
           displayMenu();
           
           user = UserChoice(); //brings back 1-9
				  //System.out.println("test user" + user); //debug test
           qtyIsAvailable=isItemLeft(qty,(user-1));
          }while(qtyIsAvailable==false);
          displayPurchase(item[user-1],cost[user-1]); //output item and cost
         userMoney = getMoney(bank,cost[user-1]); //fill the bank,checkInputAmount() AND return total amount
         
                  System.out.println("user money = " + userMoney);
        if(userMoney != cost[user-1])
         enoughInTheBank =calculateRefund(userMoney, cost[user-1], bank);
        
         } //closing main method
         
         //Kevin, Randy, and we used Christopher's
         public static void displayMenu(){
    System.out.printf("________________________________________%n");
    System.out.printf("          CS Vending Machine         %n");
    System.out.printf("________________________________________%n");
    System.out.printf("| %-5s | %-8s | %-5s |%n", "(1)  $.75 ", "(2) 5% fee", "(3)  $3.85");
    System.out.printf("| %-5s | %-8s  | %-5s |%n","  Chips   ", "$ Money $", "   Crab   ");
    System.out.printf("| %-5s | %-8s  | %-5s |%n","          ", "Exchange ", "          ");

    System.out.printf("________________________________________%n");
    System.out.printf("| %-5s | %-8s | %-5s |%n", "(4) $2.50 ", "(5)  $5.00", "(6) $39.00");
    System.out.printf("| %-5s | %-8s | %-5s |%n","  Water   ", "Plutonium ", "  T-Rex   ");
    System.out.printf("| %-5s | %-8s | %-5s |%n","          ", "          ", " Costume  ");
    System.out.printf("________________________________________%n");
    System.out.printf("| %-5s | %-8s | %-5s |%n", "(7) $10.75", "(8) $50.00", "(9)  $1.25");
    System.out.printf("| %-5s | %-8s | %-5s |%n","  Extra   ", " Homework ", "?Mystery? ");
    System.out.printf("| %-5s | %-8s | %-5s |%n","  Credit  ", "          ", "  Food    ");
    System.out.printf("________________________________________%n");

}        //class 
         public static int UserChoice()
         {
            Scanner machine = new Scanner(System.in);
            int x;
            boolean isValid = false;
            do{
            System.out.print("Enter your choice (1-9): ");
            x= machine.nextInt();
            isValid = validInput(x);
            }while(isValid == false);
            return x;         
         }//end of UserChoice
         
         //class
         public static boolean validInput(int a)
         {
            boolean valid = false;
            if(a>=1 && a<=9)
               valid = true;
            return valid;
         
         }//end of validInput
         
         //class
         public static boolean checkInputAmount(float uM, float cC)
        {
         boolean enough = false;
         if(uM >= cC)
            enough = true;
         
         return enough;
        
        }//end of checkInputAmount
        
        //class
        public static boolean isItemLeft(int[]nbrOfItems,int spot)
        {
            boolean isLeft=true;
            
            if(nbrOfItems[spot]==0)
               {
                  isLeft = false;
                  System.out.println("SOLD OUT! Please choose another item.");
                }
               
            return isLeft;
         }//end of isItemLeft
         
         //Daniel
         //displayPurchase(item[user-1], cost[user-1]); >>in main method
         public static void displayPurchase(String a, float b){
         DecimalFormat Currencya = new DecimalFormat("$ #,###,##0.00"); //currency
         System.out.println("The price for "+a+" is "+ Currencya.format(b));
         }// closing displayPurchase method


public static float getMoney(int []b,float cc) //fill the bank,checkInputAmount() AND return total amount
{
   float total=0;
   boolean enough = true;
   int []userMoney = new int[7];
    //0=n,1=d,2=q,3=ones,4=fives,5=tens,6=twenties

   Scanner machine = new Scanner(System.in);
   do{
   enough = true;
   System.out.println("Money still needed: " + (cc - total));

   System.out.print( "How many $20.00's?");
   userMoney[6] = userMoney[6] + machine.nextInt();
   total= total + userMoney[6]*20.0f;
   if(cc>total)
   {  
      System.out.println("Money still needed: " + (cc - total));
      System.out.print( "How many $10.00's?");
      userMoney[5] = userMoney[5] + machine.nextInt();
      total= total + userMoney[5]*10.0f;
      if(cc>total)
      {
         System.out.println("Money still needed: " + (cc - total));
         System.out.print( "How many $5.00's?");
         userMoney[4] = userMoney[4] + machine.nextInt();
         total= total + userMoney[4]*5.0f;
         if(cc>total)
           {
           System.out.println("Money still needed: " + (cc - total));

           System.out.print( "How many $1.00's?");
         userMoney[3] = userMoney[3] + machine.nextInt();
         total= total + userMoney[3]*1.0f;
         if(cc>total)
         {
         System.out.println("Money still needed: " + (cc - total));

            System.out.print( "How many quarters?");
         userMoney[2] = userMoney[2] + machine.nextInt();
         total= total + userMoney[2]*.25f;
            if(cc>total)
            {
            System.out.println("Money still needed: " + (cc - total));

               System.out.print( "How many dimes?");
         userMoney[1] = userMoney[1] + machine.nextInt();
         total= total + userMoney[1]*.1f;
         if(cc>total)
         {
         System.out.println("Money still needed: " + (cc - total));

            System.out.print( "How many nickels?");
         userMoney[0] = userMoney[0] + machine.nextInt();
         total= total + userMoney[0]*.05f;
         if(cc>total)
            enough =false;

         }//after nickels

            }//after dimes
            }//after quarters
     
         }//after 1's
      }//after 5's
      }//after 10s'
   //end of if first check 20's
   }while(enough == false);
   b[0] = b[0] + userMoney[0]; //.o5
   b[1] = b[1] + userMoney[1];//.10

b[2] = b[2] + userMoney[2];//.25

b[3] = b[3] + userMoney[3];//1

b[4] = b[4] + userMoney[4];//5

b[5] = b[5] + userMoney[5];//10

b[6] = b[6] + userMoney[6];//20


   return total;

}//end of getMoney
       public static boolean calculateRefund(float uM, float c, int []b)
  {
   boolean enough = true;
   
   return enough;
  
  }
} //closing class header