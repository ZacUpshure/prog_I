public class Main{

    //Linear search = iterate through one element at a time.
    public static void main(String[] args){
        int[] array = {1,4,3,2,2,0,4,5,6};
        int index = linearSearch(array, 4);

        //checking if element is positive
        if(index != -1){
            System.out.println("Element found at "+index);  //return index 
        }
        else{
            System.out.println("Element not found ");
        }
    }

    private static int linearSearch(int[] array, int value){

        //iterate through intire array.
        for(int i=0; i<array.length; i++){
             if(array[i]==value){           //check if current element is equal to input value.
                  return i;                 //found: return iterator.
             }
        }   
        return -1 ;                          //not found
    }
}