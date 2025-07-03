package Tasks.July_3rd.MethodOverriding;

public class Animal {
    void sound() {
        System.out.println("This is animal sound method");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Cow cow = new Cow();
        cow.sound();

        Animal animal = new Animal();
        animal.sound();
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    void sound(){
        System.out.println("Moo");
    }
}
