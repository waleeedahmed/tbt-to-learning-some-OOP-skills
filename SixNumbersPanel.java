// -------------------------------------------------------------
// Filename: SixNumbersPanel.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 09/05/2018
// Last Modified: 22/05/2018
// Description: This code lays out the GUI for One Player only.
// -------------------------------------------------------------


// Uses player.java to check and report numbers in textfield

import javax.swing.*;
import java.awt.event.* ;
import java.awt.*;


// Creating a sub-class called opinion under the parent class JPanel. 
public class SixNumbersPanel extends JPanel implements ActionListener {
   
   // Instance Variables
   private JLabel instructionOne;
   private JLabel instructionTwo;
   private JButton buttonOne;
   private JTextField statusOne;
   private JTextField statusTwo;
   private JTextField statusThree;
   private JTextField statusFour;
   private JTextField statusFive;
   private JTextField statusSix;
   private JTextField rollNumber;
   private JTextArea textOne;
   private String strOutput;
   private String rollNumberStr;
   
   
   // Constructor and Method
   public SixNumbersPanel() {
      instructionOne = new JLabel(" A number between 1 to 6 will appear ");
      instructionTwo = new JLabel("   once in each of the following textfields ");
      statusOne = new JTextField(3);
      statusTwo = new JTextField(3);
      statusThree = new JTextField(3);
      statusFour = new JTextField(3);
      statusFive = new JTextField(3);
      statusSix = new JTextField(3);
      buttonOne = new JButton("Roll Die");
      rollNumber = new JTextField(3);
      textOne = new JTextArea(10, 14);
      
      // Setting textboxes to become non-editable
      statusOne.setEditable(false);
      statusTwo.setEditable(false);
      statusThree.setEditable(false);
      statusFour.setEditable(false);
      statusFive.setEditable(false);
      statusSix.setEditable(false);
      rollNumber.setEditable(false);
      textOne.setEditable(false);
      textOne.setLineWrap(true);
      textOne.setWrapStyleWord(true);

      // Adding the Labels and Buttons.
      add(instructionOne);
      add(instructionTwo);
      add(statusOne);
      add(statusTwo);
      add(statusThree);
      add(statusFour);
      add(statusFive);
      add(statusSix);
      add(buttonOne);
      add(rollNumber);
      add(textOne);
      
      // Background colour
      setBackground (Color.pink);
      
      // Setting up button to listen upon Click
      buttonOne.addActionListener(this);
         
   }
   
   
   // Setting playerTest object
   Player playerTest = new Player();
   
   
   // Setting up ActionEvent as a listener 
   public void actionPerformed (ActionEvent e ) { 
   
      // This if-statement stops rollNumber from re-rolling
      if (playerTest.check21() < 21) {
         rollNumberStr = new String("" + playerTest.getDieFace());
         
      }
   
  
      // Switch-case to assign numbers to textfields
      switch(rollNumberStr) {
         case "1":
            statusOne.setText(rollNumberStr);
            break;
         case "2":
            statusTwo.setText(rollNumberStr);
            break;
         case "3":
            statusThree.setText(rollNumberStr);
            break;
         case "4":
            statusFour.setText(rollNumberStr);
            break;
         case "5":
            statusFive.setText(rollNumberStr);
            break;
         default:
            statusSix.setText(rollNumberStr);
            break;   
            
      }   
   
      
      // Setting Text beside button to number rolled
      rollNumber.setText(rollNumberStr);
      textOne.setText(playerTest.toString());
    
   } // end actionPerfomed
   
} // End of class
