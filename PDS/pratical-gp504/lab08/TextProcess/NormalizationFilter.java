package lab08.TextProcess;

public class NormalizationFilter extends TextDecorator {

    public NormalizationFilter(Text object) {
        super(object);
    }

    @Override
    public String next() {

        String initial = object.next();
        String no_diacritics = removeDiacritics(initial); 
        String string_final = no_diacritics.replaceAll("\\p{Punct}", "");

        return string_final;
    }

    private String removeDiacritics(String initial) {
        String no_diacritics = initial;
        no_diacritics = no_diacritics.replaceAll("[áàãâä]", "a");
        no_diacritics = no_diacritics.replaceAll("[éèêë]", "e");
        no_diacritics = no_diacritics.replaceAll("[íìîï]", "i");
        no_diacritics = no_diacritics.replaceAll("[óòõôö]", "o");
        no_diacritics = no_diacritics.replaceAll("[úùûü]", "u");
        no_diacritics = no_diacritics.replaceAll("[ç]", "c");
        no_diacritics = no_diacritics.replaceAll("[ñ]", "n");
        return no_diacritics;
    }
}