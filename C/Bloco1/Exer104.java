//0 - zero
//1 - one
//2 - two
//3 - three
//4 - four
//5 - five
//6 - six
//7 - seven
//8 - eight
//9 - nine
//10 - ten
//11 - eleven
//12 - twelve
//13 - thirteen
//14 - fourteen
//15 - fifteen
//16 - sixteen
//17 - seventeen
//18 - eighteen
//19 - nineteen
//20 - twenty
//30 - thirty
//40 - forty
//50 - fifty
//60 - sixty
//70 - seventy
//80 - eighty
//90 - ninety
//100 - hundred
//1000 - thousand
//1000000 - million
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;

public class Exer104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> numbers = new HashMap<>();
        
        try {
            Scanner file = new Scanner(new File("bloco1/numbers.txt"));
            while (file.hasNext()) {
                String[] line = file.nextLine().split(" - ");
                numbers.put(line[1], Integer.parseInt(line[0]));
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] words = sc.nextLine().split(" "); // split the input into words

        for (String word : words) {
            if (word.contains("-")) {
                String[] compoundWords = word.split("-");
                for (String compoundWord : compoundWords) {
                    if (numbers.containsKey(compoundWord)) {
                        System.out.print(numbers.get(compoundWord) + " ");
                    } else {
                        System.out.print(compoundWord + " ");
                    }
                }
            } else {
                if (numbers.containsKey(word)) {
                    System.out.print(numbers.get(word) + " ");
                } else {
                    System.out.print(word + " ");
                }
            }
        }

        sc.close();
    }
}