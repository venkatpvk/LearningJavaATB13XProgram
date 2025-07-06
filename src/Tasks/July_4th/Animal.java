package Tasks.July_4th;

public class Animal {
    protected void eat(){
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.doEat();
    }
}


class Dog extends Animal {
    void doEat(){
        eat();
    }
}