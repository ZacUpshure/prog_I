public class Recursion {

    public static String hello0(String s){      //  add String to Initilizing-list
        String foo="hello : "+s;

        return foo;
    }

    public static int hello1(int x, int y, int n){     // creating placeholders for passing values
                                                       // x and y are arbitrary values written in the main method.

        if (n >0) {
            n = n -1;                                   // decrements n.
                                                        // break for recursion.
            hello2(n);
        }

        return x+y;     // return the value which can be saved to a variable inside the main().
    }

    public static int hello2(int n){        // initilize n in both methods
        n = n - 1;          // decrements n, in order to decrement it on both functions.



        int fim = hello1(30, 40, n);   // hello2() calls hello1(), saves the returned value of hello1() in
                                                // integer fim and returns fim.
                                                // The returned value of hello2(), is now saved in Integer result
                                                // from the main method, in order to print it out.

        System.out.println("Hello World!");

        return fim;
    }

    public static void main(String[] args){
        String s="josh";
        String fim = hello0(s);     //passing String and save in variable.
        int result = hello2(3);  //setting n for recursion, there are now three recursion loops.
        System.out.println("The result is: "+result);
        System.out.println(fim);


    }

}
