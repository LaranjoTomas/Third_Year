package lab11.ex3;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}