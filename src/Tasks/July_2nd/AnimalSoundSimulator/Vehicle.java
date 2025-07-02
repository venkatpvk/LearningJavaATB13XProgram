package Tasks.July_2nd.AnimalSoundSimulator;

public class Vehicle {

    public static void main(String[] args) {
        // Creating the object of Bike class
        Bike bike = new Bike();
    }

    public Vehicle(){
        System.out.println("The vehicle is ready");
    }
}


class Bike extends Vehicle{

    public Bike(){
        System.out.println("Bike is ready");
    }
}
