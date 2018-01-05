package ca.bcit.comp1510.lab11;


/**
 * Yorkshire extends the dog class.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Yorkshire extends Dog {
    
    
    /**
     * Declares the weight of Yorkie.
     */
    private static final int YORKSHIRE_WEIGHT = 4;
    
    /**
     * Declares a boolean varible if
     * the dog is a ratter or not.
     */
    private boolean ratter;
    
    /**
     * Constructs a Yorkshire object.
     * @param name String
     * @param ratter boolean
     */
    public Yorkshire(String name, boolean ratter) {
        super(name);
        this.ratter = ratter;
    }
    
    @Override
    /**
     * Returns a bark.
     * @return a String
     */
    public String speak() { 
        String bark = "YAPYAPYAP!";
        return bark;
    }
    
    
    @Override
    public double averageBreedWeightKG() {
        return YORKSHIRE_WEIGHT;
    }


    @Override
    public String toString() {
        return "Yorkshire [ratter=" + ratter + ", name=" + name + "]";
    }
    
    @Override
    /**
     * Overrides the equals method.
     */
    public boolean equals(Object obj) {
        Yorkshire other = (Yorkshire) obj;
        return (this.ratter == other.ratter 
                && getName().equals(((Dog) obj).getName()));
    }
    
}
