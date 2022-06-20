import java.util.Stack;

public class Main{
    public static void main(String[] args){
        //Stack = LIFO datastructure. Last in, First out. 
        //        stores Object in a sort of vertical tower.
        //        push() to add to the top.
        //        pop() to remove from the top.  


        //constructor 
        Stack<String> stack = new Stack<String>(); 

        //empty() method = true
        //System.out.println(stack.empty());

        //push elements onto stack
        stack.push("element1");
        stack.push("element2");
        stack.push("element3");
        stack.push("element4"); 

        //print stack
        System.out.println(stack); 

        //pop elements off stack
        stack.pop();

        //print new stack with popped element 
        System.out.println(stack); 

        //peek method to look at the top element without removing it
        System.out.println(stack.peek());

        //search method to see where in the stack the searched element is
        System.out.println(stack.search("element2"));

        //uses of stack:
        //undo redo features in text editors
        //moving back and forth in browser history
        //backtracking algorithms like (maze and file directory)
        //calling functions (call stack)

        


    }
}