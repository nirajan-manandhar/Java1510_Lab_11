package ca.bcit.comp1510.lab11;


/**
 * Makes a 2D matrix.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Matrix {
    
    /**
     * Instantiates a 2D array.
     */
   private int[][] array;
   
   
   /**
    * Constructs an object called matrix.
    * @param rows an int
    * @param columns an int
    */
   public Matrix(int rows, int columns) {
       array = new int[rows][columns];
   }
   
   /**
    * Returns the number of rows.
    * @return an int
    */
   public int getRows() {
       return array.length;
   }
   
   /**
    * Returns the number of columns.
    * @return an int
    * @return
    */
   public int getColumns() {
       return array[0].length;
   }
   
   /**
    * Returns int in array location.
    * @param row an int
    * @param col an int
    * @return an int
    */
   public int getValue(int row, int col) {
       return array[row][col];
   }
   
   /**
    * Places a value in a specific location in the array.
    * @param value an int
    * @param row an int
    * @param col an int
    */
   public void setValue(int value, int row, int col) {
       array[row][col] = value;
   }


@Override
public String toString() {
    String matrix = "";
    for (int x = 0; x < array.length; x++) {
        for (int y = 0; y < array[x].length; y++) {
            matrix += array[x][y] + " "; 
            if (y == array[x].length - 1) {
                matrix += "\n";
            }
        }
    }
    return matrix;
}

/**
 * Adds the value of two matrices and returns the answer
 * in a new matrix.
 * @param m a Matrix
 * @return a Matrix
 * @throws IllegalArgumentException an exception
 */
public Matrix add(Matrix m) throws IllegalArgumentException {
    
    if (array.length != m.array.length 
            || array[0].length != m.array[0].length) {
        throw new IllegalArgumentException();
    }
    Matrix cool = new Matrix(this.array.length, array[0].length);
    
    for (int x = 0; x < array.length; x++) {
        for (int y = 0; y < array[x].length; y++) {
            cool.array[x][y] = this.array[x][y] + m.getValue(x, y);
        }
    }
    return cool;
}   


}
