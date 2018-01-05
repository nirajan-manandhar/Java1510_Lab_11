/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Driver class.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class BirdFarm {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int age1 = 13;
        final int age2 = 14;
        final int age3 = 15;
        
        Bird o = new Ostrich(age1);
        Bird p = new Penguin(age2);
        Bird c = new Cormorant(age3);
        
        System.out.println("\n----Ostrich----");
        o.move();
        System.out.println("\n----Penguin----");
        p.move();
        System.out.println("\n----Cormorant----");
        c.move();

    }

}
