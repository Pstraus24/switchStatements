// Create a program that has a variable called number that holds an integer between one and 10 inclusive.
//Get the number from the user.
//Use a switch statement to display the name for that number in a language other than English.

package com.company;
import java.util.Scanner;// import package for user input
public class Main {

    public static void main(String[] args) {
// ---------------------- initialize variables
        int number;
        // initialize scanner for user input
        Scanner input = new Scanner(System.in);
// ----------------------  prompt user for number between 1-10
        System.out.println("Enter a number from 1 to 10: ");
        number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("The number ONE in Deutsch is EINS");
                break;
            case 2:
                System.out.println("The number TWO in Deutsch is ZWEI");
                break;
            case 3:
                System.out.println("The number THREE in Deutsch is DREI");
                break;
            case 4:
                System.out.println("The number FOUR in Deutsch is VIER");
                break;
            case 5:
                System.out.println("The number FIVE in Deutsch is FUNF");
                break;
            case 6:
                System.out.println("The number SIX in Deutsch is SECHS");
                break;
            case 7:
                System.out.println("The number SEVEN in Deutsch is SIEBEN");
                break;
            case 8:
                System.out.println("The number EIGHT in Deutsch is ACHT");
                break;
            case 9:
                System.out.println("The number NINE in Deutsch is NEUN");
                break;
            case 10:
                System.out.println("The number TEN in Deutsch is ZEHN");
                break;
            default:
                System.out.println("Geben Sie bitte eine Zahl zwischen eins (1) und zehn ein (10)");
                break;
        }
    }

}