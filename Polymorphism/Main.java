public class Main{

    public static void main(String[] Args){

        Car car = new Car();
        Bycicle bike = new Bycicle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat}; 

        for(Vehicle x : racers){
            x.go();
        }
    }
}