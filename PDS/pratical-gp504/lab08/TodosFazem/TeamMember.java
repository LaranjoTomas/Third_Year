package lab08.TodosFazem;

import java.util.Date;

public class TeamMember extends Decorator {

    public TeamMember(Component component) {
        super(component);
    }

    public void start(Date date) {
        System.out.println("TeamMember starting from class team member.");
    }

    public void terminate(Date date) {
        System.out.println("TeamMember terminating from class team member.");
    }

    public void work() {
        System.out.println("TeamMember working from class team member.");
    }

    public void colaborate() {
        System.out.println("TeamMember colaborating from class team member.");
    }
}
