package Tasks.July_9th;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderException {
    public static void main(String[] args) {
        String path = "C://main//pvk";

        try {
            FileReader fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
