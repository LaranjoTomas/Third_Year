package lab08.TodosFazem;

import java.util.Date;

public class Manager extends Decorator {

    public Manager(Component component) {
        super(component);
    }

    public void start(Date date) {
        System.out.println("Manager starting from class manager.");
    }

    public void terminate(Date date) {
        System.out.println("Manager terminating from class manager.");
    }

    public void work() {
        System.out.println("Manager working from class manager.");
    }

    public void manage() {
        System.out.println("Manager managing from class manager.");
    }
}
