import java.util.*;

class Main{
    public static void main(String[] args){

  // *******************************************************
  // LinkedList =  Nodes are in 2 parts (data + address)
  //               Nodes are in non-consecutive memory locations
  //               Elements are linked using pointers
            
  //    advantages?
  //    1. Dynamic Data Structure (allocates needed memory while running)
  //    2. Insertion and Deletion of Nodes is easy. O(1) 
  //    3. No/Low memory waste
  
  //    disadvantages?
  //    1. Greater memory usage (additional pointer)
  //    2. No random access of elements (no index [i])
  //    3. Accessing/searching elements is more time consuming. O(n)
  
  //    uses?
  //    1. implement Stacks/Queues
  //    2. GPS navigation
  //    3. music playlist
  // *******************************************************

        //LinkedList comparator
        LinkedList<String> linkedList = new LinkedList<String>();
        
        //can be treated as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        //can be treated as a queue
        linkedList.poll();

        //insert
        linkedList.add(0, "E");

        //remove
        //linkedList.remove("E");

        //search
        System.out.println("'E' is located at index: "+linkedList.indexOf("E"));

        //peek first&last
        System.out.println("first element: "+linkedList.peekFirst());
        System.out.println("last element: "+linkedList.peekLast());

        //useful methods
        linkedList.addFirst("0");
        linkedList.addLast("0");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(first+" "+last);

        System.out.println("Linked List: "+linkedList); 



    }
} 