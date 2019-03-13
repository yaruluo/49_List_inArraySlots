# Implementation of variable length lists in Java

[ Yevgeniy Gorbachev, Yaru Luo ] :octocat:

### Members for List_inArraySlots
#### Fields
- Reference to an integer array
- Integer that stores the number of elements 
- Final integer that stores the initial length of the list

#### Constructors
No-arg initializes a small (8-element) integer array, with no inidices used

#### Methods 
- toString that renders all elements up to (&inc) the last used index
Methods to...
- to append an element to the end of the list
- to overwrite an element in the middle of the list
- to append another list to the end of the list
- to expand the contained integer array when necessary
- to get an element at an inputted index
- to set an element at a particular index a new value
- to add an element at any part of the array
- to remove an element from the list at any part of the array

### Remarks
The UserOfList class will instantiate several list objects and test every method in sequence on some or all of the objects, as necessary for each method.
