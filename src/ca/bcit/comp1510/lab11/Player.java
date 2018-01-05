/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Javadoc.****************************************
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Player implements Comparable<Player> {
    
    /**
     * Declares the name variale.
     */
    private String name;
    
    /**
     * Declare the teamName variable.
     */
    private String teamName;
    
    /**
     * Declares a jerseyNumber variable.
     */
    private int jerseyNumber;
    
    /**
     * A player object has three parameters representing:
     * Player name, team name and jersey number.
     * The name parameter cannot be a null value or an empty string.
     * The teamName parameter cannot be a null value or an empty string.
     * The jerseyNumber parameter cannot be zero or a negative number.
     * 
     * @param name a String
     * @param teamName a String
     * @param jerseyNumber an int
     */
    public Player(String name, String teamName, int jerseyNumber) {
        
        try {
            if (name == null || name.trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                this.name = name;
            }
            
        } catch (IllegalArgumentException n) {
            System.out.println("That is not an valid argument for name.");
        }
        
        try {
            if (teamName == null || teamName.equals("")) {
                throw new IllegalArgumentException();
            } else {
                this.teamName = teamName;
            }
            
        } catch (IllegalArgumentException n) {
            System.out.println("That is not an valid argument for team name.");
        }
        
        try {
            if (jerseyNumber < 0) {
                throw new IllegalArgumentException();
            } else {
                this.jerseyNumber = jerseyNumber;
            }
            
        } catch (IllegalArgumentException n) {
            System.out.println("Jersey number cannot be negative or zero.");
        }
    }
    

    /**
     * Returns the name of the Player.
     * @return the name as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the name of the team.
     * @return the teamName as a String.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Returns the player's jersey number.
     * @return the jerseyNumber as in int
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }


    @Override
    public int compareTo(Player o) {
        return getJerseyNumber() - o.getJerseyNumber();
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", teamName=" + teamName 
                + ", jerseyNumber=" + jerseyNumber + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
             
        if (this == other) {
            return true;
        }
        
        if (!getClass().equals(other.getClass())) {
            return false;
        }
        
        Player newPlayer = (Player) other;
        
        boolean checkName = (newPlayer.getName().equals(this.name));
        boolean checkTeamName = (newPlayer.getTeamName().equals(this.teamName));
        boolean checkJerseyNumber = newPlayer.getJerseyNumber() 
                == this.jerseyNumber;
        
        return checkName && checkTeamName && checkJerseyNumber;
    }

}


