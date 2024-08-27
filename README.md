# data-structures covered here

### 1. **Array**
An array is a data structure that stores a fixed-size sequential collection of elements of the same type. Arrays allow for quick access to elements using an index but have a fixed size that cannot be altered.

**Example:** A list of integers `[2, 4, 6, 8]` is an array where each number is accessed by its index, such as `array[0]` giving `2`.

### 2. **Graph**
A graph is a data structure consisting of a set of nodes (vertices) and a set of edges connecting pairs of nodes. Graphs can represent various structures like networks, where the nodes represent entities and the edges represent relationships.

**Example:** In a social network, each user is a node, and a friendship between two users is an edge. The graph can be used to find the shortest path of connections between two users.

### 3. **Hash Table**
A hash table is a data structure that stores key-value pairs. It uses a hash function to compute an index into an array of buckets, from which the desired value can be found quickly. Hash tables are efficient for lookups, insertions, and deletions.

**Example:** A dictionary of words where each word is the key, and its definition is the value. The hash table allows for quick retrieval of the definition by hashing the word to find its location.

### 4. **Linked List/Single Linked List**
A linked list is a linear data structure where each element (node) contains a value and a reference (link) to the next node in the sequence. A singly linked list has nodes that point only to the next node in the list.

**Example:** A sequence of numbers `1 -> 2 -> 3 -> 4` can be represented as a linked list, where each number is a node pointing to the next number. The last node points to `null`, indicating the end of the list.

### 5. **Queue**
A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. Elements are added (enqueued) at the rear and removed (dequeued) from the front.

**Example:** A line of people waiting to buy tickets is a queue. The first person in line (front) will be served first, and new arrivals join at the end of the line (rear).

### 6. **Stack**
A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. Elements are added (pushed) and removed (popped) from the top of the stack.

**Example:** A stack of books where you can only add or remove the top book. To access a book in the middle, you must first remove the ones on top.

### 7. **String**
A string is a sequence of characters, often used to represent text. Strings are typically immutable in many programming languages, meaning that they cannot be changed after they are created.

**Example:** The word "hello" is a string consisting of the characters `'h'`, `'e'`, `'l'`, `'l'`, and `'o'`.

### 8. **Tree**
A tree is a hierarchical data structure consisting of nodes connected by edges. Each tree has a root node, and every node except the root has one parent node. Trees are used to represent hierarchical relationships and structures.

**Example:** A file system is a tree where the root directory contains subdirectories and files. Each directory or file can contain more directories and files, forming a tree structure.
