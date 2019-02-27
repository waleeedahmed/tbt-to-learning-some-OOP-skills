// --------------------------------------------------
// Filename: SixNumbersPanel2.java
// Code Author(s): Mohammad Waleed Ahmed (s4569298)
//                 Minh Tam Tran (s4532460)
// Course: Bachelor of Information Technology
// Unit: NIT2112 - Object Oriented Programming
// Assignment: Unique Six Numbers
// Date Written: 9/05/2018
// Last Modified: 22/05/2018
// Description: Code for Multiplayer Game.
// --------------------------------------------------


// Importing all necessary Libraries

import javax.swing.*;
import java.awt.event.* ;
import java.awt.*;

// Declaring main class with JPanel and ActionListener Extensions 

public class SixNumbersPanel2 extends JPanel implements ActionListener {

   // Declaring all components for the GUI 
   private JLabel instructionOne;
   private JLabel instructionTwo;
   private JLabel instructionThreePlayerOne;
   private JLabel instructionFourPlayerOne;
   private JLabel instructionFivePlayerOne;
   private JLabel instructionSix;
   private JLabel instructionSeven;
   private JLabel instructionEightPlayerTwo;
   private JLabel instructionNinePlayerTwo;
   private JLabel instructionTenPlayerTwo;
   private JButton buttonOne;
   private JButton buttonTwo;
   private JButton buttonThree;
   // Player One Textfield
   private JTextField statusOne;
   private JTextField statusTwo;
   private JTextField statusThree;
   private JTextField statusFour;
   private JTextField statusFive;
   private JTextField statusSix;
   private JTextField rollNumber;
   // Player Two Textfield
   private JTextField statusSeven;
   private JTextField statusEight;
   private JTextField statusNine;
   private JTextField statusTen;
   private JTextField statusEleven;
   private JTextField statusTwelve;
   private JTextField rollNumber2;
   private JTextArea textOne;
   private String strOutput;
   private String rollNumberStr;
   private String rollNumberStr2;
   private int a;
   private int b;
   private int rolls1;
   private int rolls2;
   private boolean play1;
   private boolean play2;
   

   // Constructor & Method.
   public SixNumbersPanel2() {
   
      instructionOne = new JLabel(" A number between 1 to 6 will appear ");           
      instructionTwo = new JLabel("once in each of the following textfields");  
      
      // Setting Components for Player 1 
        
      instructionThreePlayerOne = new JLabel("                             ");
      instructionFourPlayerOne = new JLabel("Player 1");
      instructionFivePlayerOne = new JLabel("                             ");      
      
      statusOne = new JTextField(3);
      statusTwo = new JTextField(3);
      statusThree = new JTextField(3);
      statusFour = new JTextField(3);
      statusFive = new JTextField(3);
      statusSix = new JTextField(3);
      
      instructionSix = new JLabel("           ");
      instructionSeven = new JLabel("           ");
      
      buttonOne = new JButton("Roll Die - Player 1");
      rollNumber = new JTextField(3);
      
      // Setting Components for Player 2 
      
      instructionEightPlayerTwo = new JLabel("                             ");
      instructionNinePlayerTwo = new JLabel("Player 2");
      instructionTenPlayerTwo = new JLabel("                             ");
      
      statusSeven = new JTextField(3);
      statusEight = new JTextField(3);
      statusNine = new JTextField(3);
      statusTen = new JTextField(3);
      statusEleven = new JTextField(3);
      statusTwelve = new JTextField(3);
      buttonTwo = new JButton("Roll Die - Player 2");  
      rollNumber2 = new JTextField(3);
      
      
      // Setting TextArea and New Game Button
      
      textOne = new JTextArea(10, 18);
      buttonThree = new JButton("New Game");
      
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
      
      statusSeven.setEditable(false);
      statusEight.setEditable(false);
      statusNine.setEditable(false);
      statusTen.setEditable(false);
      statusEleven.setEditable(false);
      statusTwelve.setEditable(false);
      rollNumber2.setEditable(false);

      // Adding all components to the panel
      add(instructionOne);                  
      add(instructionTwo);                
      
      add(instructionThreePlayerOne);
      add(instructionFourPlayerOne);
      add(instructionFivePlayerOne);
                  
      add(statusOne);
      add(statusTwo);
      add(statusThree);
      add(statusFour);
      add(statusFive);
      add(statusSix);
      
      add(instructionSix);
      add(buttonOne);
      add(rollNumber);
      add(instructionSeven);
      
      add(instructionEightPlayerTwo);
      add(instructionNinePlayerTwo);
      add(instructionTenPlayerTwo);
      
      add(statusSeven);
      add(statusEight);
      add(statusNine);
      add(statusTen);
      add(statusEleven);
      add(statusTwelve);
      add(buttonTwo);
      add(rollNumber2);
      
      add(textOne);
      add(buttonThree);

      
      // Custom Background colour for JFrame
      Color myCustom = new Color(255,157,150);
      setBackground (myCustom);
      
      // Setting up button to Listen upon Click
      buttonOne.addActionListener(this);
      buttonTwo.addActionListener(this);      
      buttonThree.addActionListener(this);
      
      // Initialising variables for a Game Instance            
      a = 0; 
      b = 0;
      
      // Initializing rolls. String values reflecting Null   
      rolls1 = 0;
      rolls2 = 0;
      rollNumberStr = "Awaiting Roll...";
      rollNumberStr2 = "Awaiting Roll...";
      
      // Boolean values for allowing each Player to take turns
      // Both start as true so that anyone can roll first
      play1 = true;
      play2 = true;  
                     
   } // End Constructor
   
   // Initializing two Players
   Player playerTest = new Player();
   Player playerTest2 = new Player();
   
 
   // Setting up ActionEvent as a listener 
   public void actionPerformed (ActionEvent e ) { 
      
      // for player 1 
      if (e.getSource() == buttonOne) {
      
         // Stopping a Player from rolling twice in an attempt
         if (play1) {
         
            play1 = false;
            play2 = true;
            
            if ( a < 21 ) {
               
               rollNumberStr = new String("" + playerTest.getDieFace());
               int z = playerTest.dieThrowInstance();
               strOutput = "Player One rolls: " + rollNumberStr + "\n" + "Player Two rolls: " + rollNumberStr2;
               rolls1++;
               a += z;
               // Displays Final Outcome without an extra button click and de-programs roll buttons 
               if (a == 21) {
                  strOutput = "Congratulations! Player One took " + rolls1 + " rolls to get a number between 1 and 6. Player One wins!";
                  buttonOne.removeActionListener(this);
                  buttonTwo.removeActionListener(this);
               }
            }

            
            // TextFields Display Unique Number Rolled
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
         
            
            // Setting TextField beside button to number rolled
            
            rollNumber.setText(rollNumberStr);
               
            textOne.setText(strOutput);
             
         } // End 'if (Play)'
         
         else {
            textOne.setText("Awaiting Player Two's Turn...");
         }
         
      } // End buttonOne
      
      // For player 2
          
      else if (e.getSource() == buttonTwo) { 
         
         if (play2) {
            
            play1 = true;
            play2 = false;
            
            if ( b < 21 ) {
               
               // Player 2 GamePlay 
               rollNumberStr2 = new String("" + playerTest2.getDieFace());
               int x = playerTest2.dieThrowInstance();
               strOutput = "Player One rolls: " + rollNumberStr + "\n" + "Player Two rolls: " + rollNumberStr2;  
               rolls2++;
               b += x;
               
               // Displays Final Outcome without an extra button click and de-programs roll buttons 
               if (b == 21) {
                  strOutput = "Congratulations! Player Two took " + rolls2 + " rolls to get a number between 1 and 6. Player Two wins!";
                  buttonOne.removeActionListener(this);
                  buttonTwo.removeActionListener(this);
               }
            }
            
            // TextFields Display Unique Number Rolled
            switch(rollNumberStr2) {
            case "1":
               statusSeven.setText(rollNumberStr2);
               break;
            case "2":
               statusEight.setText(rollNumberStr2);
               break;
            case "3":
               statusNine.setText(rollNumberStr2);
               break;
            case "4":
               statusTen.setText(rollNumberStr2);
               break;
            case "5":
               statusEleven.setText(rollNumberStr2);
               break;
            default:
               statusTwelve.setText(rollNumberStr2);
               break;   
            }
               
                  
            // Setting Text beside button to number rolled
               
            rollNumber2.setText(rollNumberStr2);
               
            textOne.setText(strOutput);
            
         } // End "if (play2)"
         
         else {
            textOne.setText("Awaiting Player One's Turn...");
         }
         
      }
      
      // For new game button, Resets all TextFields   
         else if (e.getSource() == buttonThree) {
            statusOne.setText("");
            statusTwo.setText("");
            statusThree.setText("");
            statusFour.setText("");
            statusFive.setText("");
            statusSix.setText("");
            statusSeven.setText("");
            statusEight.setText("");
            statusNine.setText("");
            statusTen.setText("");
            statusEleven.setText("");
            statusTwelve.setText("");
            textOne.setText("");
            rollNumber.setText("");
            rollNumber2.setText("");
            textOne.setText("");
            
            // Resets all variables and arrays and re-programs Roll Buttons
            if (a == 21 || b == 21) {
               buttonOne.addActionListener(this);
               buttonTwo.addActionListener(this);
               
            }
            
            a = 0;
            b = 0;
            rolls1 = 0;
            rolls2 = 0;
            playerTest.resetArray();
            playerTest2.resetArray();
            rollNumberStr = "Awaiting Roll...";
            rollNumberStr2 = "Awaiting Roll...";
            
            play1 = true;
            play2 = true;
            
         }
     
    } // end actionPerfomed
      
   
} // End of class 