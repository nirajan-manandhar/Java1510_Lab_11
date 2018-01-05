/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Javadoc.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public abstract class Animal {
    
    
    /**
     * Declares the age variable.
     */
    protected int age;
    
    /**
     * Constructs an Animal object.
     * @param age an int
     */
    public Animal(int age) {
        this.age = age;
    }
    
    public Animal() {
        
    }
    
    /**
     * Declares abstract method move.
     */
    public abstract void move();
    
    
    /**
     * Declares abstract method eat.
     */
    public abstract void eat();
        



    
    
    
    
}
