package Tasks.July_4th;

public class Program2 {
    void add(){
        System.out.println(10 + 20);
    }

    public static void main(String[] args) {
        P2 p2 = new P2();
        p2.display();
        p2.add();
    }
}


class P2 extends Program2 {
    void add(){
        System.out.println(100 + 200);
    }

    void display(){
        super.add();
    }
}