// ------------------------------------------------------------
// Filename: DisplaySixNumbersPanel2.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 9/05/2018
// Last Modified: 23/05/2018
// Description: Displays two player game of Unique Six Numbers.
// ------------------------------------------------------------

// Importing 
import javax.swing.*;

public class DisplaySixNumbersPanel2 { 
   public static void main(String[ ] args) { 
      JFrame window = new JFrame("Six Numbers Game");
      
      SixNumbersPanel2 myPanel = new SixNumbersPanel2();
      
      window.add(myPanel);
      
      window.setSize(290, 450);
      
      window.setVisible(true); 
      
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //window.pack();
      
   } //end main
   
} //end class