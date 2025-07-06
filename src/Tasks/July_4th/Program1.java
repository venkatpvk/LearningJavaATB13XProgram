package Tasks.July_4th;

public class Program1 {

    Program1(){
        System.out.println("Program1 constructor class");
    }

    public static void main(String[] args) {
        child child = new child();
    }
}

class child extends Program1{
    child(){
        super();  // Calling the parent class constructor using super keyword
    }
}
