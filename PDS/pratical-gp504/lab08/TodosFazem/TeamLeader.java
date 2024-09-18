package lab08.TodosFazem;

import java.util.Date;

public class TeamLeader extends Decorator {

    public TeamLeader(Component component) {
        super(component);
    }

    public void start(Date date) {
        System.out.println("TeamLeader starting from class team leader.");
    }

    public void terminate(Date date) {
        System.out.println("TeamLeader terminating from class team leader.");
    }

    public void work() {
        System.out.println("TeamLeader working from class team leader.");
    }

    public void plan() {
        System.out.println("TeamLeader planning from class team leader.");
    }
}
