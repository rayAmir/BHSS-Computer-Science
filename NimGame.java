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
    int pile_a = rand.nextInt(10) + 2;
    int pile_b = rand.nextInt(10) + 2;
    int pile_c = rand.nextInt(10) + 2;
    
//P4: Create the total items running counter and pile item counter
    int item_a = pile_a;
    int item_b = pile_b;
    int item_c = pile_c;
    total_items = pile_a + pile_b + pile_c;
    
  }
}