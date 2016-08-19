import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashTester {

    public static void main(String[] args) {
        Anagram anagram = new Anagram("star");

    }


    public static void readDictionaryFile() {

        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner( new FileInputStream("words.txt") );
        }
        catch (FileNotFoundException e) {
            System.err.println("words.txt was not opened: " + e.getMessage());
        }
        finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }

}
