/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Declares a Cormorant.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Cormorant extends Bird implements Aerial, Aquatic, Terrestrial {
    
    /**
     * Constructs a Cormorant object.
     * @param age an int
     */
    public Cormorant(int age) {
        super(age);
    }

    @Override
    public void move() {
        run();
        swim();
        fly();
    }

    @Override
    public void eat() {
        System.out.println("Eat quickly, yum yum!");
    }
    
    @Override
    public void run() {
        System.out.println("Watch me run with my winds wide open for balance!");
        
    }

    @Override
    public void swim() {
        System.out.println("I am a great diver, watch out fish!");
        
    }

    @Override
    public void fly() {
        System.out.println("I must fly fast and low to avoid eagles!");
        
    }

}
