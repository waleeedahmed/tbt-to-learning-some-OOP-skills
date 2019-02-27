// -------------------------------------------------------------------
// Filename: Die.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 28/04/2018
// Last Modified: 22/05/2018
// Description: This class randomly generates a number between 1 to 6.
// -------------------------------------------------------------------


// Class Die produces a random die face from 1 to 6

public class Die {
   private final int HIGHEST;
   private int dieValue;
   
   // Constructor
   public Die() {
      HIGHEST = 6;
      dieValue = 0;
   }
     
   // Method throwDie() to return a random value
   public int throwDie() {
      dieValue = (int)(Math.random() * HIGHEST) + 1;
      return dieValue;
      
   } // End of throwDie()
   
} // End of Class Die