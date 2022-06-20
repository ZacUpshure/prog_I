public class Main {
    public static void main(String[] args){
        DynamicArray dynamicArray = new DynamicArray(5);
        
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C"); 

        dynamicArray.insert(0, "X ");
        dynamicArray.insert(4, "X ");
        dynamicArray.insert(5, "X "); 
        dynamicArray.delete("X");
        dynamicArray.delete("X");
        dynamicArray.delete("X");
        System.out.println(dynamicArray.search("C "));
 
        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);
        System.out.println("capacity: "+dynamicArray.capacity);
        System.out.println("Empty: "+dynamicArray.isEmpty());
    }
    
} 
