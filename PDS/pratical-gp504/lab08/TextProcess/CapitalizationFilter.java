package lab08.TextProcess;

public class CapitalizationFilter extends TextDecorator {
    
    public CapitalizationFilter(Text object) {
        super(object);
    }

    @Override
    public String next() {

        String final_str = "";
        String current = super.next();

        for (int i = 0; i < current.length(); i++) {
            if (i == 0 || i == current.length() - 1) {
                final_str += Character.toUpperCase(current.charAt(i));
            } else {
                final_str += Character.toLowerCase(current.charAt(i));
            }
        }

        return final_str;
    }
}