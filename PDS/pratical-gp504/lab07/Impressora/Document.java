package lab07.Impressora;

public class Document {
    
    private String name;
    
    public Document(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name;
    }

    public String[] getContent() {
        return new String[] {this.name};
    }
}
