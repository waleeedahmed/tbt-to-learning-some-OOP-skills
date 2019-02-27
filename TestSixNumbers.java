// ---------------------------------------------
// Filename: TestSixNumbers.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 28/04/2018
// Last Modified: 22/05/2018
// Description: CLI version of SixNumbersPanel.
// ---------------------------------------------


// Class to create an object from Player and evaluate checkDie()
public class TestSixNumbers {
   
   public TestSixNumbers() {}
   
   // Main method
   public static void main (String [] args) {
   
   // Initializing new object
   Player testGame = new Player();
   
   // Checking for uniqueness and displaying result of every die roll
   testGame.checkDie();
    
   // Employs getNumRolls() method from class Player to display total number of rolls
   System.out.print("Congratulations, you have taken " + testGame.getNumRolls()
                 + " rolls to get one of each number between 1 and 6.");   
   }
   
   
} // End