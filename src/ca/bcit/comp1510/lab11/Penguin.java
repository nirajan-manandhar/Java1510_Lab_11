/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Penguin class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Penguin extends Bird implements Aquatic, Terrestrial {
    
    /**
     * Constructs a Penguin object with an age.
     * @param age an int
     */
    public Penguin(int age) {
        super(age);
    }
    
    @Override
    public void eat() {
        System.out.println("I love oily nutritious fish!");
    }
    
    @Override
    public void move() {
        run();
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Splash!");
        
    }

    @Override
    public void run() {
        System.out.println("Waddle, waddle, waddle!");        
    }

}
