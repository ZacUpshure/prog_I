public class Methods {

    public static String hello0(String s){      //  add String to Initilizing-listu
        String foo="hello : "+s;

        return foo;
    }

    public static int hello1(int x, int y){     // creating placeholders for passing values
                                                // x and y are arbitrary values written in the main method.

        return x+y;     // return the value which can be saved to a variable inside the main()
    }

    public static void hello2(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args){
        String s="josh";
        String fim = hello0(s);     //passing String and save in variable.
        hello2();
        int result = hello1(40, 20);    //passing values for the pre-defined placeholders.
        System.out.println("The result is: "+result);
        System.out.println(fim);


    }

}
