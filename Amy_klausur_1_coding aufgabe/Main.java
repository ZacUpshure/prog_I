import java.util.*;

class Main{
    public static char n = 'n';
    public static void main(String[] args){
        String[] str_array = {"Sonne", "Mond", "Stern", "Party", "Chillen", "Tanzen", "Apfel", "Birne", "Sanddorn"};

        method(str_array);
    }

    public static void method(String[] str_array){
        for(int i=0; i <= str_array.length; i++){

            char[] ch = new char[str_array[i].length()];

            int l = str_array[i].length()-1;
                ch[i] = str_array[i].charAt(l);

                if(ch[i] == n){
                    System.out.println(i); 
                }
        }
        
    }
}