package Tasks.July_2nd.AnimalSoundSimulator;

public class User {

    public static void main(String[] args) {
        // Multilevel Inheritance
        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.login();  // first class method inherited
        superAdmin.accessAdminPannel();  // second class method inherited
        superAdmin.shutDownSystem();  // it's own method calling using the obj
    }

    public void login(){
        System.out.println("This is a login method");
    }

}

class AdminUser extends User {
    public void accessAdminPannel(){
        System.out.println("This is admin pannel access method");
    }
}

class SuperAdmin extends AdminUser {
    void shutDownSystem(){
        System.out.println("This is a method in the super admin class to shut down the system");
    }

}