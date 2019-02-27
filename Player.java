// ----------------------------------------------------
// Filename: Player.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 28/04/2018
// Last Modified: 22/05/2018
// Description: This class contains all the methods 
//       that connect to all 3 parts of the assignment.
// ----------------------------------------------------


// Importing Arrays class to work on array
import java.util.Arrays;


// Initializing Player class and declaring variables
public class Player {
   private boolean value;
   private int[] dieValues = new int[6];
   private int a;
   private int b;
   private int rolls;
   private int outcome;
   private int sum;
   private int update;
      
   // Constructor
   public Player() {
   
      //int[] dieValues = new int[6];
      int a = 0; 
      int b = 0;
      int rolls = 0;
      int outcome = 0;
      int sum = 0;
      int update = 0;
      
   }
      
   // Initializing new object from class Die
   Die instance = new Die();
   
   
   // Method used to obtain and save face value of die thrown 
   public int getDieFace() {
      outcome = instance.throwDie();                                                              
      return outcome;
      
   }
   
   
   // Method to check if a die value is unique (Part 1)
   public void checkDie() {
      
      dieValues = new int[6];
      
      while (sum != 21) {                   // Keeps rolling die until sum from 1 to 6 obtained 
         outcome = instance.throwDie();     // Saving face value in variable outcome
         System.out.println("Number rolled: " + outcome);
         rolls++;                           // Record number of times die is rolled
         
         
         // for loop compares Face Value with previous values and checks for uniqueness 
         for (int i = 0; i <= 5; i++) {   
            if (dieValues[i] == outcome) {
               value = false;
               break;
            }
            else {
               value = true;
            }
         }
         
         // Value is saved in array if Face Value is unique
         if (value) {
            dieValues[update] = outcome;
            sum += outcome;
            update++; // Variable used to elongate array if a unique value is to be stored
         }
         
         // Displaying result as an array after every die roll        
         System.out.print("So far, you have: ");
         Arrays.sort(dieValues,0,update); // Sorting the array in ascending order
         for (int count = 0; count < update; count++) {
            System.out.print(dieValues[count] + " ");
         }
         
         System.out.println();
                
      } // End of while loop 
       
    } // End of checkDie()
    
    
   // Method below does same as checkDie() except when button is pressed in a GUI case (Part 2)
   public int dieThrowInstance() {
   
      // for loop compares Face Value with previous values and checks for uniqueness 
      for (int i = 0; i <= 5; i++) {   
         if (dieValues[i] == outcome) {
            value = false;
            break;
            }
         else {
            value = true;
            }
      }
         
      // Value is saved in array if Face Value is unique
      if (value) {
         dieValues[update] = outcome;
         update++;       // Variable used to elongate array if a unique value is to be stored
         a = outcome;
      } 
      else {
         a = 0;
      }
      
      return a;         // Returns zero if non-unique value is found      
   }
   
   
   // Method to grab return value from dieThrowInstance() and then adds up until it equals 21 (Part 2)
   public int check21() {
      b += dieThrowInstance();
      return b;
   }
   
   
   // This method display final outputs (Part 2) 
   public String toString() {
      int getNumRollsValue;
      String strOutput;
      if (check21() < 21) {
         rolls++;
         strOutput = "Roll count: " + getNumRolls();
      }
      else {
         getNumRollsValue = getNumRolls() + 1;
         strOutput = "Congratulations, you have taken " + getNumRollsValue + " rolls to get one of each number between 1 and 6.";
      }
      return strOutput;
      
   }


    // Method to obtain number of die rolls (Part 1 and 2)
    public int getNumRolls() {
      return rolls;
    }
    
    
    // Custom method to Reset Array for New Game Button (Part 3)
    public void resetArray() {
      for (int i = 0; i <= 5; i++) {
         dieValues[i] = 0;
      }
      update = 0;
      value = false;
      a = 0;
   }
      
} //  End Player
   
   
       
    
    
    
   