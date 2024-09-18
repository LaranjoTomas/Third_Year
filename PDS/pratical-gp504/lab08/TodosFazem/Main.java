package lab08.TodosFazem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();

        Component employee = new Employee();
        Component manager = new Manager(employee);
        manager.start(data);
        manager.work();
        manager.terminate(data);
        ((Manager) manager).manage();

        Component TeamLeader = new TeamLeader(manager);
        TeamLeader.start(data);
        TeamLeader.work();
        TeamLeader.terminate(data);
        ((TeamLeader) TeamLeader).plan();

        Component TeamMember = new TeamMember(TeamLeader);
        TeamMember.start(data);
        TeamMember.work();
        TeamMember.terminate(data);
        ((TeamMember) TeamMember).colaborate();
    }
}
