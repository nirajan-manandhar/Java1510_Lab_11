/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Tests the Matrix class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class MatrixDriver {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        
        Matrix matrix = new Matrix(2, 2);
        matrix.setValue(2, 0, 0);
        matrix.setValue(three, 0, 1);
        matrix.setValue(four, 1, 0);
        matrix.setValue(five, 1, 1);
        
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(1, 0, 0);
        matrix2.setValue(2, 0, 1);
        matrix2.setValue(three, 1, 0);
        matrix2.setValue(four, 1, 1);
 
        System.out.println(matrix.toString());
        System.out.println(matrix2.toString());
        System.out.println(matrix.add(matrix2).toString());
        
        Matrix matrix3 = new Matrix(2, three);
        matrix3.setValue(1, 0, 0);
        matrix3.setValue(2, 0, 1);
        matrix3.setValue(three, 0, 2);
        matrix3.setValue(four, 1, 0);
        matrix3.setValue(five, 1, 1);
        matrix3.setValue(six, 1, 2);
        
        System.out.println(matrix3.toString());
        
        try {
            System.out.println(matrix.add(matrix3).toString());
        } catch (IllegalArgumentException I) {
            System.out.println("The matrices are different sizes!");
        }
    }

}
