package lab08.TextProcess;

public class TextMain {
    public static void main(String[] args) {

        System.out.println("\n"); // Prints 2 lines to space output and make it more readable

        String filename = "lab08/TextProcess/teste.txt";

        Text text = new TextReader(filename);
        Text cap_filter = new CapitalizationFilter(new TextReader(filename));
        Text norm_filter = new NormalizationFilter(new TextReader(filename));
        Text term_filter = new TermFilter(new TextReader(filename));
        Text vowel_filter = new VowelFilter(new TextReader(filename));


        System.out.println("Original text:");
        while (text.hasNext()) {
            System.out.println("\n" + text.next());
        }

        System.out.println("\nTerm Filter:");
        while (term_filter.hasNext()) {
            System.out.println("\n" + term_filter.next());
        }

        System.out.println("\nNormalization Filter:");
        while (norm_filter.hasNext()) {
            System.out.println("\n" + norm_filter.next());
        }
        
        System.out.println("\nCapitalization Filter:");
        while (cap_filter.hasNext()) {
            System.out.println("\n" + cap_filter.next());
        }

        System.out.println("\nVowel Filter:");
        while (vowel_filter.hasNext()) {
            System.out.println("\n" + vowel_filter.next());
        }

        System.out.println("\n"); // Prints 2 lines to space output and make it more readable
    }
}
