/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Labrador class which extends Dog.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Labrador extends Dog {

    /**
     * Declares the Lab's weight.
     */
    private static final  int LABRADOR_WEIGHT =  35;
    
    /**
     * Declares the Lab's color variable.
     */
    private String color;
    
    /**
     * Javadoc.
     * @param name a String
     * @param color a String
     * @throws NullPointerException used
     */
    public Labrador(String name, String color) throws NullPointerException {
        super(name);
        try {
            if (color.trim().isEmpty() || color == null) {
               throw new NullPointerException();
            } else {
                this.color = color;
            }
        } catch (NullPointerException n) {
            System.out.println("Name cannot be nothing.");
        }        
    }
    
    @Override
    /**
     * Returns a bark.
     * @return a String
     */
    public String speak() { 
        String bark = "BOW WOW!";
        return bark;
    }

    @Override
    public double averageBreedWeightKG() {
        return LABRADOR_WEIGHT;
    }

    @Override
    public String toString() {
        return "Labrador [color=" + color + ", name=" + name + "]";
    }

    @Override
    /**
     * Overrides the equals method.
     * @param obj an Object
     * @return a boolean
     */
    public boolean equals(Object obj) {
        Labrador other = (Labrador) obj;
        return (color.equals(other.color) 
                && getName().equals(((Dog) obj).getName()));

    }




    
}
