package lab08.TextProcess;

public class TermFilter extends TextDecorator {
    
    public TermFilter(Text object) {
        super(object);
    }

    @Override
    public String next() {
        return super.next().split(" ")[0];
    }
}
