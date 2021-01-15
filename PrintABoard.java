
/**
 * Write a description of class PrintABoard here.
 *
 * @author (your name)
 * @version (4.2.2)
 */

import java.util.Scanner;

public class PrintABoard
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    static String[][] buildBoard() {
        String[][] board = {};
        
        for (int a=0; a < 5; a++) {
            for (int b=0; b<5; b++) {
                board[a][b] = "0";
            }
        }
        return board;
    }
    
    static void printBoard(String[][] board) {
        for (int a  =0; a<5; a++) {
            for (int b=0;b<5;b++) {
                System.out.print("   " + board[a][b] + "   ");
            }
        }
    }
    
    static String[][] changeBoard(String[][] board) {
        int number = 5;
        int aCount = 0;
        int bCount = 0;
        Scanner key = new Scanner(System.in);
        
        for (int a=0;a<number;a++) {
            for (int b=0;b<number;b++) {
                aCount = a+1;
                bCount = b+1;
                
                System.out.print("Input the value for the next string in position " + aCount + ", " + bCount + ":");
                board[aCount][bCount] = key.next();
            }
        }
        return board;
    }
    
    static String[][] changeBoardNumber(String[][] board, int x, int y) {
        Scanner key = new Scanner(System.in);
        
        System.out.print("State the value for the string that's in positon " + x + " " + y + ":");
        board[x][y] = key.next();
        return board;
    }
    public static void main(String[] args) {
        
        boolean playAgain = true;
        boolean fillASlot = true;
        
        int number = 5;
        String[] myStringArray = {"0", "1", "2", "3", "4"};
        
        int elementNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();
            
            System.out.println("There is an array with a place for five strings.");
            
            System.out.println("Here are the values inside of the array.");
            
            for (int a=0; a<number; a++) {
                int numberPlusOne = a + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[a] + ".");
            }
            System.out.print("Type true if you want to replace one or more elements inside the array.");
            fillASlot = myScanner.nextBoolean();
            
            while (fillASlot) {
                System.out.print("Which element number do you want to replace? Input a number between 1 and 5.");
                elementNumber = myScanner.nextInt();
                int printNumber = elementNumber + 1;
                
                System.out.print("Enter the replacement for the element " + elementNumber + ": ");
                myStringArray[elementNumber - 1] = myScanner.next();
                
                System.out.print("Type true if you want to replace one or more elements in the array.");
                fillASlot = myScanner.nextBoolean();
            }
            
            System.out.println("Here are the values in the array: ");
            
            for (int a=0; a<number; a++) {
                int numberPlusOne = a + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[a] + ".");
            }
            System.out.print("Do you want to start this whole program again? Type true or false: ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);
    }
}