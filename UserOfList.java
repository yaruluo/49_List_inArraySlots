/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        /* Populate the list with elements, but with a small enough
           number that we expect no invocation of expand().
        */
        int elemIndex;
        for( elemIndex = 0; elemIndex < 5; elemIndex++ ) {
            list.add( -elemIndex); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Add enough elements that expansion is expected
        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Trust no one.
        for( ; elemIndex < 35; elemIndex++ )
            list.add( -elemIndex);
        System.out.println("after second expansion: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());
        
        // test accessor
        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }

        // test set
        setTest(  8);
        setTest( 16);
        System.out.println();

        // test adding at a specified position
        addAtTest( 0, 29); // beginning of the list

        // end of the list using the new add method
        addAtTest( list.size(), 17);

        addAtTest( 2, 19); // middle of a small list

        // force an expansion
        addAtTest( 2, 23);
        addAtTest( 2, 23);
        addAtTest( 2, 23);

        System.out.println("removing value " + list.remove( 6)
                          + ", leaving " + list.size() + " elements:");
        System.out.println( list);
        System.out.println(
            "expecting:" + System.lineSeparator()
          + "[29,0,23,23,23,19, NO -1 HERE! -2,-3...]");
    }  // end of main()

    private static void setTest( int modifyAt
                              ) {
        System.out.println(
            "changed element " + modifyAt + " from "
          + list.set( modifyAt, modifyAt + 1000) + " to "
          + list.get( modifyAt)
          );
     }

     private static void addAtTest( int addAt
                                 , int value
                                 ) {
        list.add( addAt, value);
        System.out.println(
            "insert " + value
          + " at position " + addAt
          + ", resulting in "  + list.size() + " elements:"
          + System.lineSeparator()
          + list
          + System.lineSeparator()
        );
    }
}
