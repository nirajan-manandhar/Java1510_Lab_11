/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.Scanner;
/**
 * Tests the Player class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class ComparePlayers {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Player[] playerArray = new Player[2];
        
        final int negativeTestNumber = -4;
        final int jerseyNumberOne = 6;
        final int jerseyNumberTwo = 21;
        
        Player pGeoff = new Player("Geoff", "Rockets", negativeTestNumber);
        Player pJohnathan = new Player("Johnathan", "", jerseyNumberOne);
        Player pCarl = new Player(null, "Jets", jerseyNumberTwo);
        
        playerArray[0] = pGeoff;
        playerArray[0] = pJohnathan;
        playerArray[0] = pCarl;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter a player name");
            String name = scan.next();
            System.out.println("Please enter a team name");
            String teamName = scan.next();
            System.out.println("Please enter a jersey number");
            int number = scan.nextInt();
            
            Player newPlayer = new Player(name, teamName, number);
            playerArray[i] = newPlayer;
        }
        
        scan.close();
        System.out.println("" + playerArray[0].compareTo(playerArray[1]));
        
        
        
    }

}
