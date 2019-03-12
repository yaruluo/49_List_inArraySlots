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

<<<<<<< HEAD
    /**
      Appends @value to the end of this list.
=======
  /**
   * Insert @value at position @index in this list.
   * 
   * Shift the element currently at that position (if any) and any subsequent
   * elements to the right (that is, increase the index associated with each).
   */
  public void add(int index, int value) {
    int[] elements_new = new int[1 + filledElements];
    //populate the first few elements
    int i = 0;
    for ( ; i < index; i++) {
      elements_new[i] = elements[i];
    }
    System.out.println(Arrays.toString(elements_new));
    System.out.println(Arrays.toString(elements));
    elements_new[i] = value;
    i++;
    for ( ; i < filledElements + 1; i++) {
      elements_new[i] = elements[i - 1];
    }
    elements = elements_new;
    filledElements++;
  }
>>>>>>> parent of 1887a01... Updated List_iAS.add(int, int) to share behavior with yaruluo's add(int,int)

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