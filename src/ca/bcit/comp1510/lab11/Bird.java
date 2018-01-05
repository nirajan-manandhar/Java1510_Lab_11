/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Declares a bird.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public abstract class Bird extends Animal {
    
    /**
     * Stores the feather color.
     */
    private String fcolor;
    
    /**
     * Constructs a Bird and sets the feather color.
     * @param fcolor a String
     */
    Bird(String fcolor) {
        super();
        this.fcolor = fcolor;
    }
    
    /**
     * Constructs bird with age.
     * @param age an int.
     */
    Bird(int age) {
        super();
        this.age = age;
    }

    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }
    
    

}
