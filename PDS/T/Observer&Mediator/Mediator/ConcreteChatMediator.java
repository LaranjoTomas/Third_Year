package Mediator;

import java.util.ArrayList;
import java.util.List;

class ConcreteChatMediator implements ChatMediator {
    private List<Colleague> colleagues;

    public ConcreteChatMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void sendMessage(Colleague sender, String message) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }
}