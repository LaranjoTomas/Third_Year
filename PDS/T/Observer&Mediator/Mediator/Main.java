package Mediator;


public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();
        Colleague e1 = new BasicColleague(mediator);
        Colleague e2 = new BasicColleague(mediator);
        mediator.addColleague(e1);
        mediator.addColleague(e2);
        e1.sendMessage();
        e2.sendMessage();
        e1.sendMessage();
        e2.sendMessage();
    }
}