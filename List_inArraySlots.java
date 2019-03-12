/**
  Implement a list of integer elements, including
  both data and operations.
 */

/*Note from Yevgeniy:
  Each element i has integer, double, and String 'components'.
  typeOfElements stores which of the components is relevant.
*/

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */

    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      intElements = new int[INITIAL_CAPACITY];
      doubleElements = new double[INITIAL_CAPACITY];
      stringElements = new String[INITIAL_CAPACITY];
      filledElements = 0;
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
      return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    // public String toString() {
    // }
      //For each element in typeOfElements:
      //return the index of the correct one of the three arrays that store elements.

    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     // public boolean add( int type   // same meaning as in typeOfElements
                       // , int intValue
                       // , double doubleValue
                       // , String stringValue
                       // ) {
     // }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     // }
}