package lab11.ex3;

public class Main {
    
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj1");
        User user2 = new UserImpl(mediator, "Pankaj2");
        User user3 = new UserImpl(mediator, "Pankaj3");
        User user4 = new UserImpl(mediator, "Pankaj4");
        User user5 = new UserImpl(mediator, "Pankaj5");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi All");
    }
}
