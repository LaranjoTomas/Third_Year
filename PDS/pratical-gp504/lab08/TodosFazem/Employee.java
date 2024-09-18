package lab08.TodosFazem;

import java.util.Date;

public class Employee implements Component{
    public void start(Date date) {
        System.out.println("Employee starting from class employee.");
    }

    public void terminate(Date date) {
        System.out.println("Employee terminating from class employee.");
    }

    public void work() {
        System.out.println("Employee working from class employee.");
    }
}
