package lab08.TextProcess;

import java.io.File;
import java.util.Scanner;

public class TextReader implements Text {

    private Scanner sc;
    
    public TextReader(String filename) {

        try {
            this.sc = new Scanner(new File(filename));
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }

    public boolean hasNext() {
        return sc.hasNextLine();
    }

    public String next() {
        String result = sc.nextLine();
        return result;
    }
}