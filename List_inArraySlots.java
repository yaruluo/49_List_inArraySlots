/**
 * Implement a list of integer elements, including both data and operations.
 */

import java.util.*;
public class List_inArraySlots {

  private int[] elements; // container for the elements of the list
  private int filledElements; // the number of elements in this list

  private static final int INITIAL_CAPACITY = 10;

  /**
   * Construct an empty list with a small initial capacity.
   */
  public List_inArraySlots() {
    elements = new int[INITIAL_CAPACITY];
    // filledElements has been initialized to the desired value, 0
  }

  /**
   * @return the number of elements in this list
   */
  public int size() {
    return filledElements;
  }

  /**
   * @return a string representation of this list, in [a,b,c,] format
   */
  public String toString() {
    String result = "[";
    for (int elemIndex = 0; elemIndex < filledElements; elemIndex++)
      result += elements[elemIndex] + ",";
    return result + "]";
  }

  /**
   * Appends @value to the end of this list.
   * 
   * @return true, in keeping with conventions yet to be discussed
   */
  public boolean add(int value) {
    // expand if necessary
    if (filledElements == elements.length)
      expand();

    elements[filledElements] = value;
    filledElements++;
    // idiomatic version: elements[ filledElements++] = value;
    return true;
  }

  /**
   * Double the capacity of the List_inArraySlots, preserving existing data.
   */
  private void expand() {
    System.out.println("expand... (for debugging)");
    /*
     * S.O.P. rules for debugging: Working methods should be silent. But during
     * development, the programmer must verify that this method is called when that
     * is appropriate. So test using the println(), then comment it out.
     */
    int[] bigger = new int[elements.length * 2];
    for (int elemIndex = 0; elemIndex < filledElements; elemIndex++)
      bigger[elemIndex] = elements[elemIndex];
    elements = bigger;
  }

  /**
   * accessor
   * 
   * @return element @index from this list precondition: @index is within the
   *         bounds of the array. (Having warned the user about this precondition,
   *         you should NOT complicate your code to check whether user violated
   *         the condition.)
   */
  public int get(int index) {
    return elements[index];
  }

    /**
      Appends @value to the end of this list.
=======
  /**
   * Insert @value at position @index in this list.
   * 
   * Shift the element currently at that position (if any) and any subsequent
   * elements to the right (that is, increase the index associated with each).
   */

  /**
   * Set value at @index to @newValue
   * 
   * @return old value at @index
   * @precondition: @index is within the bounds of this list.
   */
  public int set(int index, int newValue) {
    int old = elements[index];
    elements[index] = newValue;
    return old;
    
  }
  /**
   * Insert @value at position @index in this list.
   * 
   * Shift the element currently at that position (if any) and any subsequent
   * elements to the right (that is, increase the index associated with each).
   */
  public void add(int index, int value) {
    int[] elements_new = new int[filledElements * 2];
    //populate the first few elements
    int i = 0;
    for ( ; i < index; i++) {
      elements_new[i] = elements[i];
    }
    elements_new[i] = value;
    i++;
    for ( ; i < filledElements + 1; i++) {
      elements_new[i] = elements[i - 1];
    }
    elements = elements_new;
    filledElements++;
  }

  //expand the array by 1
  //fill the first few elements, stop once the inserting index is reached
  //successful, when i = index, loop ends.
  //assign the value to the right index
  //fill in the rest of the elements, stops at filledElements + 1
  /**
   * Remove the element at position @index in this list.
   * 
   * Shift any subsequent elements to the left (that is, decrease the index
   * associated with each).
   * 
   * @return the value that was removed from the list
   */
  public int remove(int index) {
    // populate first few elements
    
    int deletee = elements[index];
    index++;
    for ( ; index < filledElements; index++) {
      elements[index - 1] = elements[index];
    }
    elements[index] = 0;
    filledElements--;
    return deletee;
  }

}