import java.util.Arrays;
  

public class Main{

    //binary search = is a search algorithm that finds a target value within a sorted array

    public static void main(String[] args){
        int array[] = new int[100];
        int target = 42; 

        for(int i=0; i < array.length; i++){
            array[i] = i+1;
        } 
        //int index = Arrays.binarySearch(array, target);  
        int index = binarySearch(array, target);  

        if(index > -1){
            System.out.println("Element found at: "+index);
        }
        else{
            System.out.println(target+" not found");
        }
    }

    private static int binarySearch(int array[], int target ){
        //instantiate the two ends 
        int low = 0;
        int high = array.length-1;
 
        //iterate through array
        while(low <= high ){
            int middle =  low+(high-low)/2;     //instantiate middle 
            int value = array[middle];          
             
            System.out.println("middle: "+ value);  

            if(value< target){                  //if the value is smaller than target, eliminate the
                low = middle+1;                 //rest until the value (value included) 'middle+1'
            }
            else if(value>target){              //if the value is larger than target, eliminate the
                high=middle-1;                  //rest until the value (value included) 'middle- 1'
            }
            else {
                return middle;  //found
            }
        }

        return -1;  //not found 
    }
}