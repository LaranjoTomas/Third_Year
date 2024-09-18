package Mediator;

public interface ChatMediator {
    void sendMessage(Colleague sender, String message);
    void addColleague(Colleague colleague);
}
