package lab08.TextProcess;

public class TextDecorator implements Text{

    public Text object;
    
    public TextDecorator(Text object) {

        this.object = object;
    }

    public boolean hasNext() {
        return object.hasNext();
    }

    public String next() {
        return object.next();
    }
}