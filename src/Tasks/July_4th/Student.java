package Tasks.July_4th;

public class Student {
    void showDetails() {
        System.out.println("This is showDetails method in Student class");
    }

    public void showInfo(){
        System.out.println("Public Access: StudentInfo");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.showInfo();
    }
}
