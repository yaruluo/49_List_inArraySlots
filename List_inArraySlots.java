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
      intElements = new int[ INITIAL_CAPACITY];
      doubleElements = new double[ INITIAL_CAPACITY];
      stringElements = new String[ INITIAL_CAPACITY];
      filledElements = 0;
      typeOfElements = new int[ INITIAL_CAPACITY];
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
    public String toString() {
	String returnedStr = new String();
	returnedStr = "[";
	for( int i = 0; i < filledElements; i++) {
	    if( typeOfElements[ i] == 0) 
		returnedStr += intElements[ i] + ", ";
	    if( typeOfElements[ i] == 1) 
		returnedStr += doubleElements[ i] + ", ";
	    if( typeOfElements[ i] == 2) 
		returnedStr += stringElements[ i] + ", ";
	}
	returnedStr += "]";
	return returnedStr;
    }
      //For each element in typeOfElements:
      //return the index of the correct one of the three arrays that store elements.

    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    
     public boolean add( int type   // same meaning as in typeOfElements
                       , int intValue
                       , double doubleValue
                       , String stringValue
                       ) {
	 if ( filledElements == intElements.length)
	     expand();

	 intElements[ filledElements] = intValue;
	 doubleElements[ filledElements] = doubleValue;
	 stringElements[ filledElements] = stringValue;

	 typeOfElements[ filledElements] = type;

	 filledElements++;
	 return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
    
    private void expand() {
	System.out.println( "expand... (for debugging)");
	int oldL = intElements.length;
	int[] expanded_ints = new int[2 * oldL];
	for (int i = 0; i < filledElements; i++) {
	    expanded_ints[i] = intElements[i];
	}
	intElements = expanded_ints;
	double[] expanded_doubles = new double[2 * oldL];
	for (int i = 0; i < filledElements; i++) {
	    expanded_doubles[i] = doubleElements[i];
	}
	doubleElements = expanded_doubles;
	String[] expanded_Strings = new String[2 * oldL];
	for (int i = 0; i < filledElements; i++) {
	    expanded_Strings[i] = stringElements[i];
	}
	stringElements = expanded_Strings;
      
	int[] expanded_types = new int[2 * oldL];
	for (int i = 0; i < filledElements; i++) {
	    expanded_types[i] = typeOfElements[i];
	}
	typeOfElements = expanded_types;
   }

    public Element get( int index){
	Element val = new Element();
	val.type = typeOfElements[ index];
	val.intValue = intElements[ index];
	val.doubleValue = doubleElements[ index];
	val.stringValue = stringElements[ index];
	return val;
    }
    
}
