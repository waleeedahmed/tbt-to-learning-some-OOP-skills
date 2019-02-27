// ------------------------------------------------
// Filename: DisplaySixNumbersPanel.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 09/05/2018
// Last Modified: 22/05/2018
// Description: Driver Class for SixNumbersPanel.
// -------------------------------------------------

// Importing
import javax.swing.*;


public class DisplaySixNumbersPanel { 

   // Main Method
   public static void main(String[ ] args) { 
      
      JFrame window = new JFrame("Six Numbers Game");
      
      SixNumbersPanel myPanel = new SixNumbersPanel();
      
      window.add(myPanel);
      
      window.setSize(270, 350);
      
      window.setVisible(true); 
      
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
   } //end main
   
} //end class