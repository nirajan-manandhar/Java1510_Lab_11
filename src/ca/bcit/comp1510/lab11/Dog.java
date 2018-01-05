/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Abstract class Dog.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public abstract class Dog {
    
    /**
     * Declares the Dog's name variable.
     */
    protected String name;
    
    /**
     * Constructs a Dog object.
     * @param name a String.
     * @throws NullPointerException an exception.
     */
    public Dog(String name) throws NullPointerException {
        try {
            if (name.trim().isEmpty() || name == null) {
               throw new NullPointerException();
            } else {
                this.name = name;
            }
        } catch (NullPointerException n) {
            System.out.println("Name cannot be nothing.");
        }
    }

    /**
     * Returns the Dog object's name.
     * @return the name as a String
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns a bark.
     * @return a String
     */
    public String speak() { 
        String bark = "WOOF!";
        return bark;
    }
    
    /**
     * Abstract method for Dog's weight.
     * @return a double
     */
    public abstract double averageBreedWeightKG();

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }

    @Override
    /**
     * Compare two dogs based on their name.
     * @return a boolean
     * @param obj an object
     */
    public boolean equals(Object obj) {
        return getName().equals(((Dog) obj).getName());
    }
       
}
