# Implementation of variable length lists in Java

[ Yevgeniy Gorbachev, Yaru Luo ] :octocat:

### Members for List_inArraySlots
#### Fields
Reference to first node in the list

#### Constructors
No-arg initializes the list with a null in the aforementioned reference

#### Methods 
- Indexing method to follow the links from one node to the next for a certain number of steps (argument of 0 returns the first node)
- Method to determine length of list
- Method to insert node after a certain index
- Method to overwrite the contents of a node, leaving link to subsequent node intact
- Method to erase the contents of a node
- Method to remove a node entirely
- Method to add a node to the end of a list
- Method to add the contents of a list of nodes to the end of a list

### Remarks
Implementation of a node object will be necessary. The node object will contain a reference to some useful data and a reference to the next node.

The UserOfList class will instantiate several list objects and test every method in sequence on some or all of the objects, as necessary for each method.
