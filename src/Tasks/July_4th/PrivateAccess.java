package Tasks.July_4th;

public class PrivateAccess {
    String name = "Krishna";
    private  int BankBalance=20_000;


    int getBankBalance(){
        return BankBalance;
    }


}

class normal extends PrivateAccess {
    public static void main(String[] args) {
        PrivateAccess privateAccess = new PrivateAccess();
        System.out.println(privateAccess.getBankBalance());

    }
}
