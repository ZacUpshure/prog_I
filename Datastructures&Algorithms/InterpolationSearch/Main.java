public class Main{
    public static void main(String[] args){

        int[] array = {1,2,3,8,125,226,455,777,1024};
        int index = interpolationSearch(array, 226  );
        System.out.println(index);
    }

    private static int interpolationSearch(int[] array, int value){
        int high = array.length -1;     //instantiate bounds 
        int low = 0; 

        while(value >= array[low] && value <= array[high] && low <= high){      //approaching from left and right 
            int probe = low + (high-low)*(value-array[low])/(array[high]-array[low]); 

            System.out.println("probe: "+probe);

            if(array[probe] == value){
                return probe;
            }
            else if(array[probe]<value){
                low = probe+1;
            }
            else{
                high=probe-1; 
            }
              
        }

        return 0;
    }

}