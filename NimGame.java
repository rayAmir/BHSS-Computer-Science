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
    
//P4: Create the total items running counter and pile item counter
    int item_a = pile_a;
    int item_b = pile_b;
    int item_c = pile_c;
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
      // Scenerio 1: user 1 picks pile a and removes a #
      if (reader.equals("A")||reader.equals("a")){
        System.out.println("How many to remove from pile A");
        int pile_1 = myScanner.nextInt();
        while (pile_1<=0){
        System.out.println("You must choose at least 1. How many?");
        pile_1 = myScanner.nextInt();
        } 
        pile_a = pile_a - pile_1;
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
      // Scenerio 2: User 1 picks pile a and removes a #
      else if (reader.equals("B")||reader.equals("b")){
        System.out.println("How many to remove from pile B");
        String pile_2 = myScanner.nextLine();
        int pile_num2 = Integer.parseInt(pile_2);
        pile_b = pile_b - pile_num2; 
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
      // Scenerio 3: User 1 picks pile c & removes a #
      else if (reader.equals("C")||reader.equals("c")){
        System.out.println("How many to remove from pile C");
        String pile_3 = myScanner.nextLine();
        int pile_num3 = Integer.parseInt(pile_3);
        pile_c = pile_c - pile_num3;
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
      System.out.print("A: " + pile_a);
      System.out.print(" B: " + pile_b);
      System.out.print(" C: " + pile_c);
      System.out.println(); //Will Skip to the next Line    
      System.out.println(user_two + "," + " Choose a pile:");
      String reader = myScanner.nextLine();
// Scenerio 1: user 2 picks pile a and removes a #
      if (reader.equals("A")||reader.equals("a")) {
        System.out.println("How many to remove from pile A");
        String pile_1 = myScanner.nextLine();
        int pile_num1 = Integer.parseInt(pile_1);
        pile_a = pile_a - pile_num1;
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
// Scenerio 2: User 2 picks pile b and removes a #
      else if (reader.equals("B")||reader.equals("b")){
        System.out.println("How many to remove from pile B");
        String pile_2 = myScanner.nextLine();
        int pile_num2 = Integer.parseInt(pile_2);
        pile_b = pile_b - pile_num2; 
        total_items = pile_a + pile_b + pile_c;
        turn++;
      }
// Scenerio 3: User 1 picks pile c & removes a #
      else if (reader.equals("C")||reader.equals("c")){
        System.out.println("How many to remove from pile C");
        String pile_3 = myScanner.nextLine();
        int pile_num3 = Integer.parseInt(pile_3);
        pile_c = pile_c - pile_num3;
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