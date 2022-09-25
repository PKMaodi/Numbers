/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.JavaAssigment;

import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class Support {

        public void changeDecToHexa(int userNumber, Scanner in){
            String convertedNumber;
            System.out.println("Enter your base 10(Decimal) number: ");
            userNumber = in.nextInt();
     
            while(userNumber > 10000 || userNumber < 0){
                System.out.println("Enter a number more than zero or less than ten thousand");
                userNumber = in.nextInt();
            }
            convertedNumber = Integer.toHexString(userNumber);
            System.out.println(userNumber + " = " + convertedNumber + " as a Hexadecimal Number");
            
        }
 
        public void changeDecimalToBin(int userNumber, Scanner in){
            String convertedNumber;
            
            System.out.println("Enter your base 10(Decimal) number: ");
            userNumber = in.nextInt();
            
            while(userNumber > 10000 || userNumber < 0){
                System.out.println("Enter a number more than zero or less than ten thousand");
                userNumber = in.nextInt();
            }
            
            convertedNumber = Integer.toBinaryString(userNumber);
            System.out.println(userNumber + " = " + convertedNumber + " as a Binary Number");
        }
        
        
        public void changeBinToDec(String userNumber, Scanner in){
            int convertedNumber;
            
            System.out.println("Enter your base 2(Binary) number: ");
            userNumber = in.nextLine();
            while(userNumber != null){
                for(int k = 0;k < userNumber.length();k++){
                    if(Character.isLetter(userNumber.charAt(k))){
                        System.out.println("Enter a number that only has zeros and ones");
                    }
                }
                
            }
            convertedNumber = Integer.parseInt(userNumber, 2);
            System.out.println(userNumber + " = " + convertedNumber + " as a Decimal Number");
        }
}
