package Tasks.July_3rd.MethodOverriding;

public class User {
    void login(){
        System.out.println("User login");
    }

    public static void main(String[] args) {
        User user = new RegularUser();
        user.login();  // The method for which the object is created is called, even if parent reference is used
    }
}

class AdminUser extends User {
    void login() {
        System.out.println("Admin user login");
    }
}

class RegularUser extends User {
    void login(){
        System.out.println("Regular user login");
    }
}
