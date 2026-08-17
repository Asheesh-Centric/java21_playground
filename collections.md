# Comparison b/w Arraylist and LinkedList and ArrayDeque

- ArrayList:
  - DS : Dynamic Array
  - Insertion Complexity at end : O(1) amortized (one of the operation to resize the array and copy the elements)
  - Insertion complexity at front : O(n) (because we need to shift all the elements to right)
  - Deletion Complexity : O(n) (because we need to shift all the elements to left)
  - Reading Complexity : O(1) (because we can access the element by index)

- LinkedList:
  - DS : Doubly Linked List
  - Insertion Complexity at end : O(1) (add to a node from the end)
  - Insertion complexity at front : O(1) (add to a node from the front)
  - Insertion complexity at middle : O(n) (because we need to traverse the list to find the position)
  - Deletion Complexity at end : O(1) (remove from a node from the end)
  - Deletion Complexity at front : O(1) (remove from a node from the front)
  - Deletion Complexity at middle : O(n) (because we need to traverse the list to find the position)
  - Reading Complexity : O(n) (because we need to traverse)
- ArrayDeque:
  - DS : Resizable Array
  - Insertion Complexity at end: O(1) amortized (one of the operation to resize the array and copy the elements)
  - Insertion complexity at front: O(1) amortized (one of the operation to resize the array and copy the elements)
  - Insertion complexity at middle: O(n) (because we need to shift the elements to right)
  - Deletion Complexity : O(1) amortized (one of the operation to resize the array and copy the elements)
  - Reading Complexity : O(n) (because we need to traverse)


## HashCode and equals method bug if key is changed in HashMap
public class BugTest {
public static void main(String[] args) {
var ashish = new Person("Ashish", 30);
var vishal = new Person("Vishal", 32);
        var set = new HashSet<Person>(List.of(ashish, vishal));
        System.out.println(set.contains(ashish)); // true
        ashish.setAge(31);
        System.out.println(set.contains(ashish)); // false
    }
}

Explanation: HashSet is backed by HashMap. HashMap takes the key and value here value is null but the key is the object we passin hashset
- hashcode is used to find the bucket where the object will be stored. if some object are there already in the linkedlist then equals method is used to find that new object is duplicate or not.
- so if we insert an object in hashset and later we modify any field of the object those are part of hashCode() then wrong hashcode will be produced and lookup will be failed.