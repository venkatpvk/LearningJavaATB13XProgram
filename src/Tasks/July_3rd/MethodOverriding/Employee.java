package Tasks.July_3rd.MethodOverriding;

public class Employee {
    void role() {
        System.out.println("General Employee");
    }

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        clerk.role();

        Manager manager = new Manager();
        manager.role();
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("Manager Role");
    }
}

class Clerk extends Employee {
    void role(){
        System.out.println("Clerk Role");
    }
}

class Tester extends Employee {
    void role(){
        System.out.println("Tester role");
    }
}