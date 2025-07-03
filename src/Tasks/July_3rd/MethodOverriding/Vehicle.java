package Tasks.July_3rd.MethodOverriding;

public class Vehicle {
    void start(){
        System.out.println("This is a start method in Vehicle class");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();

        Car car = new Car();
        car.start();
    }
}

class Bike extends Vehicle {
//    void start(){
//        System.out.println("Kick start the bike");
//    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Turn the key to start the car");
    }
}
