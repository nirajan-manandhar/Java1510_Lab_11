/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Driver class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class DogTest {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        //Dog dog = new Dog();
        //An abstract class cannot be instantiated.
        
        Labrador hannah = new Labrador("Hannah", "Golden");
        
        System.out.println(hannah.toString());
        System.out.println(hannah.speak());
        System.out.println(hannah.averageBreedWeightKG());
        
        Yorkshire seb = new Yorkshire("Sebastian", true);
        
        System.out.println(seb.toString());
        System.out.println(seb.speak());
        System.out.println(seb.averageBreedWeightKG());
        

    }

}
