import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        //Queue = FIFO datastructure. First in, First out. 
        //        A collection designed to hold elements prior to processing.
        //        Linear data structure.

        //        offer() to add to the top.
        //        poll() to remove from the top. 
        //        peek() to examine   


        //since the queue is an 'Interface', it cant be instantiated right away.
        //collection->queue->Deque->'LinkedList'.
        //therefor the constructor of the class Queue is instantiated with a LinkedList.
        Queue<String> queue = new LinkedList<String>();   

        //add elements to queue.
         queue.offer("element1");
         queue.offer("element2");
         queue.offer("element3");
         queue.offer("element4");

         //examine.
         System.out.println("queue before  poll: "+queue);
         System.out.println("top-element: "+queue.peek()+"\n");

         //remove elements from queue.
         //poll will not cause an exeption even if 
         //the queue is empty.
         queue.poll();

         //examine again.
         System.out.println("queue after poll: "+queue);
         System.out.println("top-element: "+queue.peek()); 


         System.out.println("\n"+"is queue empty?: "+queue.isEmpty()); 
         System.out.println("size of queue: "+queue.size()); 
         System.out.println("is 'element3' contained?: "+queue.contains("element3")); 

         //use for queues:
         //keyboard buffer
         //printer queue
         //LinkedList, PriorityQueue, Breadh first search

    }
}