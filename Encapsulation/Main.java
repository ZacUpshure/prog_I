public class Main{

    public static void main(String[] args) {
        
       car Car = new car("Tesla", "Model X", 2022);     //call constructor.

        System.out.println(Car.getManufracturer());     //print a private attribute through a Getter-Interface.

        Car.setYear(2023);  //used setter method to change year.

        System.out.println(Car.getYear());  //print the new setted year.
    }
}