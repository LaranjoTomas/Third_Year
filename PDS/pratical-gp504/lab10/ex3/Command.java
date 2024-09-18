package lab10.ex3;

public interface Command<E> {
    public void execute();

    public void undo();
}