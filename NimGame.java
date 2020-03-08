/*
* Date: March 7, 2020
* Name: Rayyan Amir
* Teacher: Mr. Ho
* Description: Club Fair Assignment
*/

//P1: Start & initilize Code
import java.util.Scanner;
import java.util.Random;
class NimGame{
  public static void main(String[] args){
    int total_items = 0;
    int turn = 0;
    
//P2: Create Name System
    Scanner myScanner = new Scanner (System.in);
    System.out.println("Welcome to Nim Game");
    System.out.println("User 1, enter your name:");
    String user_one = myScanner.nextLine();
    System.out.println("User 2, enter your name:");
    String user_two = myScanner.nextLine();
    
//P3: Create Pile Randomizer
    Random rand = new Random(); 
    int pile_a = rand.nextInt(9) + 1;
    int pile_b = rand.nextInt(9) + 1;
    int pile_c = rand.nextInt(9) + 1;
    
//P4: Create the pile item counter
    total_items = pile_a + pile_b + pile_c;
 
    while (true){
//User 1 Interface  
    if(turn %2 == 0){
//P5: Create the user interface & Scenerios
      System.out.print("A: " + pile_a);
      System.out.print(" B: " + pile_b);
      System.out.print(" C: " + pile_c);
      System.out.println(); //Will Skip to the next Line      
      
      System.out.println(user_one + "," + " Choose a pile:");
      String reader = myScanner.nextLine();
      while (pile_a <= 0 && reader.equals("A")){
        System.out.println("Pile A is taken. Try another pile.");
        reader = myScanner.nextLine();
      }
      while (pile_c <= 0 && reader.equals("C")){
        System.out.println("Pile C is taken. Try another pile.");
        reader = myScanner.nextLine();
      }
      while (pile_b <= 0 && reader.equals("B")){
         System.out.println("Pile B is taken. Try another pile.");
         reader = myScanner.nextLine();
      }
// Scenerio 1: user 1 picks pile a and removes a #
      if (reader.equals("A")||reader.equals("a")){
        System.out.println("How many to remove from pile A");
        int pile_1 = myScanner.nextInt();
        while ((pile_1<=0) || (pile_1>pile_a)){
        System.out.println("Illegal Move. Try Again.");
        pile_1 = myScanner.nextInt();
        } 
        pile_a = pile_a - pile_1;
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
      
      // Scenerio 2: User 1 picks pile a and removes a #
      else if (reader.equals("B")||reader.equals("b")){
        System.out.println("How many to remove from pile B");
        int pile_2 = myScanner.nextInt();
        while ((pile_2<=0) || (pile_2>pile_b)){
        System.out.println("Illegal Move. Try Again.");
        pile_2 = myScanner.nextInt();
        } 
        pile_b = pile_b - pile_2; 
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
      // Scenerio 3: User 1 picks pile c & removes a #
      else if (reader.equals("C")||reader.equals("c")){
        System.out.println("How many to remove from pile C");
        int pile_3 = myScanner.nextInt();
        while ((pile_3<=0) || (pile_3>pile_c)){
        System.out.println("Illegal Move. Try Again.");
        pile_3 = myScanner.nextInt();
        } 
        pile_c = pile_c - pile_3;
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }    
      // Part 7: Exiting the game (the end) 
      if (total_items == 1){
      System.out.println(user_two + ", " + "you must take the last remaining counter, " + "so you lose. " + user_one + " wins!");
      break;
      }
    }
//User 2 interface
    else if (turn%2 != 0){
//P5: Create the user interface & Scenerios
      System.out.print(" A: " + pile_a);
      System.out.print(" B: " + pile_b);
      System.out.print(" C: " + pile_c);
      System.out.println(); //Will Skip to the next Line    
      System.out.println(user_two + "," + " Choose a pile:");
      String reader = myScanner.nextLine();
      while (pile_a <= 0 && reader.equals("A")){
        System.out.println("Pile A is taken. Try another pile.");
        reader = myScanner.nextLine();
      }
      while (pile_c <= 0 && reader.equals("C")){
        System.out.println("Pile C is taken. Try another pile.");
        reader = myScanner.nextLine();
      }
      while (pile_b <= 0 && reader.equals("B")){
         System.out.println("Pile B is taken. Try another pile.");
         reader = myScanner.nextLine();
      }
// Scenerio 1: user 2 picks pile a and removes a #
      if (reader.equals("A")||reader.equals("a")) {
        System.out.println("How many to remove from pile A");
        int pile_4 = myScanner.nextInt();
        while ((pile_4<=0) || (pile_4>pile_a)){
        System.out.println("Illegal Move. Try Again.");
        pile_4 = myScanner.nextInt();
        } 
        pile_a = pile_a - pile_4;
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
// Scenerio 2: User 2 picks pile b and removes a #
      else if (reader.equals("B")||reader.equals("b")){
        System.out.println("How many to remove from pile B");
        int pile_5 = myScanner.nextInt();
        while ((pile_5<=0) || (pile_5>pile_b)){
        System.out.println("Illegal Move. Try Again.");
        pile_5 = myScanner.nextInt();
        } 
        pile_b = pile_b - pile_5; 
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
// Scenerio 3: User 1 picks pile c & removes a #
      else if (reader.equals("C")||reader.equals("c")){
        System.out.println("How many to remove from pile C");
        int pile_6 = myScanner.nextInt();
        while ((pile_6<=0) || (pile_6>pile_c)){
        System.out.println("Illegal Move. Try Again.");
        pile_6 = myScanner.nextInt();
        } 
        pile_c = pile_c - pile_6;
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
// Part 7: Exiting the game (the end) 
      if (total_items == 1){
        System.out.println(user_one + ", " + "you must take the last remaining counter, " + "so you lose. " + user_two + " wins!");
        break;
    } 
   }
  }
 }
}