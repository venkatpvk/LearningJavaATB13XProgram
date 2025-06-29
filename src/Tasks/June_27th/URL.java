package Tasks.June_27th;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        // Taking the URL info from the user
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine().toLowerCase().trim();

        // To check with what the URL ends with
        if (url.endsWith(".com")) {
            System.out.println("The website type is: Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (url.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("The website type is: Network related provider");
        } else if (url.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        }else if (url.endsWith(".xyz")) {
            System.out.println("The website type is:  Unknown or other types of websites");
        } else {
            System.out.println("The website type is: Unknown or other");
        }

    }
}
