/**
    Implement a list of integer elements, including
    both data and operations.
 */

public class List_inArraySlots {

        private int[] refToArray;
        private int last_index;//last used index

        public List_inArraySlots() {
            refToArray = new int[8];
            last_index = -1;//Represents lack of use, is sufficient for the other methods to not break on empty lists
        }


        /** 
            @return the number of elements in this list
         */
        public int size() {
            return last_index + 1;
        }


         /** 
             @return a string representation of this list,
             in [a, b, c,] format
            */ 
        public String toString() {
            String result = "[";
            for (int i = 0; i <= last_index; i++) {//adds all elements up to the "last index"
                result += refToArray[i] + ", ";
            }
            return result + "]";
        }

        
        /** 
            Appends @value to the end of this list.
            
            @return true, in keeping with conventions yet to be discussed
         */


        public boolean add( int value) {
            if (last_index + 1 < refToArray.length) {//check for space to store element
                refToArray[++last_index] = value;
                return true;
            } else { // if there is not enough room
                return false; //consider expansion to call the expand() method if necessary
            }
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

         /*
         suggestion from Yev: To expand, first initialize an array with twice the size of refToArray
         For loop the elements from the current array into the expanded array
         Given that there are no explicit calls to expand() in UserOfList,
         reccomend invoation in the "else" block of add()
         */
}