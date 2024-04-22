/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part_1;
import javax.swing.JOptionPane;
/**
 *
 * @author ANhan
 */
public class POE_Part_1 {

    public static void main(String[] args) {
     
      //prompting the user to enter useId
        String userId = JOptionPane.showInputDialog("Enter userId that has 5 charaters long with a under score:  ");

     //prompting the user to enter password
        String  password = JOptionPane.showInputDialog("Please enter a password with 8 characters, at least one number, one special character, and one capital letter: ");  
       

        // Check if login is successful
        boolean isSuccess = confirmingUserId(userId) && confirmingPassword(password);

        // Display login status
         JOptionPane.showMessageDialog(null,returnLoginStatus(isSuccess));
         
        //checking if user meets the correct username 
         boolean isValidUserId = confirmingUserId(userId); 
         if(isValidUserId){
              JOptionPane.showMessageDialog(null,"nice to see " + userId);
         }
         else{
             JOptionPane.showMessageDialog(null,"User ID is not valid. Please make sure it is 5 characters long and contains an underscore.");
        } 
    }

    public static String returnLoginStatus(boolean isSuccess) {
        if (isSuccess) {
            return "Login successful! ";
        } else {
            return "Login failed. Please check your credentials and try again.";
        }
    }

  public static boolean confirmingUserId(String userId){ 
        //This are the conditions that the user must follow 
        return userId.contains ("_")&& userId.length() ==5;
    }

  public static boolean confirmingPassword(String password) {
        // Checking character lenght 
        if (password.length() < 8) {
              JOptionPane.showMessageDialog(null,"Do ensure your password has 8 character ");
            return false;
        }

        // Checking for at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null,"Do ensure your password has a letter " ); 
            return false;
        }

        // Checking for at least one digit
        if (!password.matches(".*[0-9].*")) {
              JOptionPane.showMessageDialog(null,"Do ensure your password has a digit ");
            return false;
        }

        // Checking for at least one special character
        if (!password.matches(".*[!@#$%^&*()].*")) {
              JOptionPane.showMessageDialog(null,"Do ensure your password has a special character ");
            return false;
        }

        return true;
    }
}
