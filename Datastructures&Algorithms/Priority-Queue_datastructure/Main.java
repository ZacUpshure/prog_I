import java.util.*;

class Main{
    public static void main(String[] args){

        //FIFO but with priority higherarchy
        //Queue<String> queue = new PriorityQueue<>(); 


        //priority comparator
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); 

        //even though the elements are not in order,
        //the list is being prioritized and the
        //out put is in order. 
        queue.offer("B");
        queue.offer("A");
        queue.offer("D");
        queue.offer("C");

        //display and remove first element until queue is empty.
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
} 
