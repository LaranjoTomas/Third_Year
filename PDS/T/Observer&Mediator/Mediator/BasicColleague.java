package Mediator;

class BasicColleague implements Colleague {
    private ChatMediator mediator;

    public BasicColleague(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage() {
        mediator.sendMessage(this, "Hello, this is a message from " + this.getClass().getSimpleName());
    }

    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
