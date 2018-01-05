/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Declares an Ostrich.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Ostrich extends Bird implements Terrestrial {
    
    /**
     * Ostrich constructor.
     * @param age an int
     */
    public Ostrich(int age) {
        super(age);
    }
    

    @Override
    public void move() {
        run();
        
    }

    @Override
    public void eat() {
        System.out.println("Watch me gobble up these lizards yum yum!");
        
    }

    @Override
    public void run() {
        System.out.println("Look at how fast I lope across the savannah!");
    }

}
