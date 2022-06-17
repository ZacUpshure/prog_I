public class Main{
    public static void main(String[] args){
        
        // calling a constructor is creating an object.
        Car car = new Car();
        Bycicle bike = new Bycicle();

        car.go();
        bike.go();

        bike.speed = 2.5;

        System.out.println(bike.speed);
    }
}