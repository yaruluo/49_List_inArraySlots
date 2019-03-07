# Implementation of variable length lists in Java

[ Yevgeniy Gorbachev, Yaru Luo ] :octocat:

### Members for List_inArraySlots
#### Fields
Reference to an integer array
Integer that stores the last used index
#### Constructors
No-arg initializes a small (8-element) integer array, with no inidices used

#### Methods 
- toString that renders all elements up to (&inc) the last used index
Methods to...
- to append an element to the end of the list
- to overwrite an element in the middle of the list
- to append another list to the end of the list
- to expand the contained integer array when necessary
### Remarks

The UserOfList class will instantiate several list objects and test every method in sequence on some or all of the objects, as necessary for each method.
