import java.util.*;

public class Main{
    public static void main(String[] args){
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "element1");
        table.put(101, "element2");
        table.put(102, "element3");
        table.put(103, "element4");
        table.put(104, "element5");

        table.remove(102);

        System.out.println(table);

        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10+"\t"+key+"\t"+table.get(key));
        }
    }
}