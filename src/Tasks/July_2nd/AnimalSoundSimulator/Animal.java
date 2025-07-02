package Tasks.July_2nd.AnimalSoundSimulator;

public class Animal {

    public static void main(String[] args) {
        // creating the object for a child class
        cat cat = new cat();
        cat.meow();  // child class object calling child method
        cat.makeSound(); // Child class object calling the method it inherited from parent

    }

    public void makeSound(){
        System.out.println("This is the base class, sound of an animal");
    }

}

class cat extends Animal {
    public void meow(){
        System.out.println("This is a method in the cat class, meow");
    }
}
