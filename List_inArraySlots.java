/**
    Implement a list of integer elements, including
    both data and operations.
 */

public class List_inArraySlots {

        private int[] refToArray;

        public List_inArraySlots() {
            refToArray = new int[8];
        }


        /** 
            @return the number of elements in this list
         */
        public int size() {
            return refToArray.length;
        }


         /** 
             @return a string representation of this list,
             in [a, b, c,] format
            */ 
        public String toString() {
            String result = "[";
            for (int i: refToArray) {
                result += i + ", ";
            }
            return result + "]";
        }

        
        /** 
            Appends @value to the end of this list.
            
            @return true, in keeping with conventions yet to be discussed
         */


        public boolean add( int value) {
          newli = new int[size() + 1];
          for (int i = 0; i < size(); i++) {
            newli[i] = refToArray[i];
          }
          newli[size() + 1] = value;
        }


        /** 
            Double the capacity of the List_inArraySlots, 
            preserving existing data
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