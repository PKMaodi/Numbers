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
public class AssignmentApp {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("Choose an option from the following");
        System.out.println("1. Change a Decimal number to a Binary number\n" +
                           "2. Change a Decimal number to a Hexadecimal number\n" +
                           "3. Change a Binary number to a Decimal number\n" +
                           "9. Exit program");
        option = input.nextInt();
        Support sp = new Support();
        while(option != 0){
            switch(option){
                case 1: sp.changeDecimalToBin(option, input);
                break;
                
                case 2: sp.changeDecToHexa(option, input);
                break;
                
                case 3: sp.changeBinToDec("" + option, input);
                break;
                
                case 9: System.exit(0);
                break;
            }
            option = input.nextInt();
        }
    }
}
