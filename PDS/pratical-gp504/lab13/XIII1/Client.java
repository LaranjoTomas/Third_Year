package lab13.XIII1;

public class Client {

    private String code;
    private String name;
    private Product sharedItem;

    public Client(String code, String name) {
        this.code = code;
        this.name = name;
        this.sharedItem = null;
    }

    public void shareItem(Product item) {
        sharedItem = item;
    }

    public Product getItem() {
        return sharedItem;
    }

    public String getcode() {
        return code;
    }

    public String getname() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void update() {
        System.out.println("Client " + name + " received a notification");
    }
}
